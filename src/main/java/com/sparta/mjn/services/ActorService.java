package com.sparta.mjn.services;

import com.sparta.mjn.entities.Actor;

import javax.ejb.Stateful;
import javax.persistence.*;
import java.util.List;

@Stateful
public class ActorService {

    @PersistenceContext(unitName = "UserPersistenceUnit")
    private EntityManager em;

    public String requestFilms(){

        return "films";
    }

    public List getActorList(){
        return em.createNamedQuery("getActors", Actor.class).getResultList();
    }


}
