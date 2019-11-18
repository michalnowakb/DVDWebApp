package com.sparta.mjn.beans;

import com.sparta.mjn.entities.Film;
import com.sparta.mjn.services.FilmService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class FilmBean {

    @Inject
    private FilmService filmService = new FilmService();

    private Film film = new Film();

    public Film getFilm() {
        return film;
    }

    public List displayFilmDetails() {
        return filmService.getFilmDetails(film);
    }



}
