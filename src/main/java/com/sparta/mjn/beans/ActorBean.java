package com.sparta.mjn.beans;

import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.services.ActorService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private ActorService actorService;

    private Actor actor = new Actor();

    public String getFilms(){
        return actorService.requestFilms();
    }

    public List getActorList(){
        return actorService.getActorList();
    }
}
