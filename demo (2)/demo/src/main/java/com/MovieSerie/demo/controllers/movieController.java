package com.MovieSerie.demo.controllers;

import com.MovieSerie.demo.model.Movie;
import com.MovieSerie.demo.repositories.movieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/movie")
public class movieController {
@Autowired
private movieRepository movieRepository;
@GetMapping
public List<Movie> getAllMovie(){
    return movieRepository.findAll();

}
@PostMapping
public Movie createMovie(@RequestBody Movie Movie){
    return movieRepository.save(Movie);
}




}
