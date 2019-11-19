package com.sparta.mjn.beans;

import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.entities.Film;
import com.sparta.mjn.services.FilmService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.ManyToMany;
import java.util.List;
import java.util.Set;

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


    @ManyToMany(mappedBy = "film")
    private Set<Actor> actorList;

    public Set<Actor> getActorList() {
        return actorList;
    }

}
