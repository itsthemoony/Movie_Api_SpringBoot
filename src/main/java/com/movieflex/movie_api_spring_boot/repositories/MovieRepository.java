package com.movieflex.movie_api_spring_boot.repositories;

import com.movieflex.movie_api_spring_boot.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
