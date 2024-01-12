package ru.skypro.homework.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    @Email
    @NotBlank (message = "Email must not be blank")
    private String username;
    @NotBlank(message = "Password must not be blank")
    private String password;

}
