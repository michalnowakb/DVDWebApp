package com.sparta.mjn.services;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateful
public class ActorService {

    @PersistenceContext(unitName = "UserPersistenceUnit")
    private EntityManager em;

    public String requestFilms(){

        return "films";
    }

    public List getActorList(){
        return em.createQuery("SELECT first_name, last_name FROM actor").getResultList();
    }

}
