package com.movieflex.movie_api_spring_boot.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 200)
    @NotBlank(message = "Please provide a title")
    private String title;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a director")
    private String director;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a studio")
    private String studio;

    @ElementCollection
    @CollectionTable(name = "movie_casts")
    private Set<String> casts;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a release year")
    private Integer releaseYear;

    @Column(nullable = false)
    @NotBlank(message = "Please provide a poster")
    private String poster;
}
