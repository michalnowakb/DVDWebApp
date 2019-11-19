package com.sparta.mjn.beans;

import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.services.ActorService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.Set;

@Named
@RequestScoped
public class ActorBean {

    @Inject
    private ActorService actorService;

    private Actor actor = new Actor();

    public List getActorList(){
        return actorService.getActorList();
    }

    public Set getFilmList() {
        return actorService.filmList(actor);
    }
}
