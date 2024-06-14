package com.MovieSerie.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idFilm;
    private String dateSortie ;
    private String acteurs ;
    private String description ;
    private String titre;
    private Float note;

    @ManyToMany(mappedBy = "favoriteFilms")
    private Set<User> users;

}