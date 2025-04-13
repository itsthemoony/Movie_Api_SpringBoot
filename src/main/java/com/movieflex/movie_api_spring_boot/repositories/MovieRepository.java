package com.movieflex.movie_api_spring_boot.repositories;

import com.movieflex.movie_api_spring_boot.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
