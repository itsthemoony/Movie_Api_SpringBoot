package com.movieflex.movie_api_spring_boot.dto;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovieDto {

    private Integer id;

    @NotBlank(message = "Please provide a title")
    private String title;

    @NotBlank(message = "Please provide a director")
    private String director;

    @NotBlank(message = "Please provide a studio")
    private String studio;

    private Set<String> casts;

    private Integer releaseYear;

    @NotBlank(message = "Please provide a poster")
    private String poster;

    @NotBlank(message = "Please provide a poster url")
    private String posterURL;
}
