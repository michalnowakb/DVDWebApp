package com.sparta.mjn.services;

import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.entities.Film;

import javax.ejb.Stateful;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Stateful
public class ActorService {

    @PersistenceContext(unitName = "UserPersistenceUnit")
    private EntityManager em;

    public List getActorList(){
        return em.createNamedQuery("getActors", Actor.class).getResultList();
    }

    public Set<Film> filmList(Actor actor) {
        return actor.getFilmList();
    }
}
