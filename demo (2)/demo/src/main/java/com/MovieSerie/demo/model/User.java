package com.MovieSerie.demo.model;

import com.MovieSerie.demo.model.Movie;
import com.MovieSerie.demo.model.Serie;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "app_user")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idUser;
    private String userName;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "favoriFilm",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "film_id")
    )
    private Set<Movie> favoriteFilms;

    @ManyToMany
    @JoinTable(
            name = "favoriSirie",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "sirie_id")
    )
    private Set<Serie> favoriteSiries;
}