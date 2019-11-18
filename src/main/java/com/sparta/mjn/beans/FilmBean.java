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
    private FilmService filmService;

    private Film film = new Film();

    public String getActors() {
        return filmService.requestActors();
    }

    public List filmList() {
        return filmService.getFilmList();
    }



}
