package com.MovieSerie.demo.repositories;

import com.MovieSerie.demo.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface movieRepository extends JpaRepository<Movie, Long> {

}
