package ru.skypro.homework.dto;

import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@Builder
@AllArgsConstructor
public class CreateOrUpdateAd {
    @NotBlank(message = "Title must not be blank")
    private String title;
    @Min(0)
    private Integer price;
    @NotBlank(message = "Description must not be blank")
    private String description;

}
