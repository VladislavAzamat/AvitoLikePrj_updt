package ru.skypro.homework.service.impl;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ru.skypro.homework.config.UserDetailsServiceImpl;
import ru.skypro.homework.dto.Register;
import ru.skypro.homework.entity.ImageEntity;
import ru.skypro.homework.entity.UserEntity;
import ru.skypro.homework.repository.UserEntityRepository;
import ru.skypro.homework.service.AuthService;


@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);
    private final PasswordEncoder encoder;
    private final UserDetailsServiceImpl userDetailsService;
    private final UserEntityRepository userEntityRepository;

    /**
     * Using {@link UserDetailsServiceImpl#loadUserByUsername(String username)}
     * and {@link PasswordEncoder#matches(CharSequence, String)} login user;
     * @param userName String;
     * @param password String;
     * @return encoder.matches(password, userDetails.getPassword());
     */
    @Override
    public boolean login(String userName, String password) {
        UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        return encoder.matches(password, userDetails.getPassword());
    }

    /**
     * Checking user's information using
     * {@code userEntityRepository.findByUsername(register.getUsername()).get()};
     * <br>
     * <br> In case of new user, save user's information using
     * {@code userEntityRepository.save(userEntity);}
     * @param register Register;
     * @return true;
     */
    @Override
    public boolean register(Register register) {

        UserEntity userEntity = userEntityRepository.findByUsername(register.getUsername()).orElse(new UserEntity());

       if (userEntity.getUsername() != null) {
            logger.warn("User with current username (email) had been registered before!");
            return false;
        }
               userEntity =  UserEntity.builder()
                        .password(encoder.encode(register.getPassword()))
                        .username(register.getUsername())
                        .firstName(register.getFirstName())
                        .lastName(register.getLastName())
                        .phone(register.getPhone())
                        .role(register.getRole())
                        .imageEntity(new ImageEntity())
                        .build();

        userEntityRepository.save(userEntity);
        logger.info("User with username (email) " + register.getUsername() + " has been registered!" );
        return true;
    }

}
