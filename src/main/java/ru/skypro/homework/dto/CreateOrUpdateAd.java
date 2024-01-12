package ru.skypro.homework.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;

@Data
@Builder
@AllArgsConstructor
//@NoArgsConstructor
public class CreateOrUpdateAd {
    @NotBlank (message = "Title must not be blank")
    private String title;
    @Min(0)
    private Integer price;
    @NotBlank(message = "Description must not be blank")
    private String description;

}
