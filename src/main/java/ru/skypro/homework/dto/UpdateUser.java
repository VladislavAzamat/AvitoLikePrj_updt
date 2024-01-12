package ru.skypro.homework.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUser {
    @NotBlank(message = "FirstName must not be blank")
    private String firstName;
    @NotBlank(message = "LastName must not be blank")
    private String lastName;
    @NotBlank(message = "PhoneNumber must not be blank")
    @Pattern(regexp = "\\+7|8[0-9]{10}", message = "Телефонный номер должен начинаться с +7 или 8, затем - 10 цифр")
    private String phone;

}
