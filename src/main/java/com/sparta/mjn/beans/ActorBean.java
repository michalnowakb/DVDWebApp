package com.sparta.mjn.beans;

import com.sparta.mjn.entities.Film;
import com.sparta.mjn.services.ActorService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private ActorService actorService;

    public String getFilms(){
        return actorService.requestFilms();
    }
}
