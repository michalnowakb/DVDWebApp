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

    public List <Actor> getActorList() {
        return em.createNamedQuery("getActors",Actor.class).getResultList();
    }

    public List<Film> getFilms(int actorId)
    {
        Query query = em.createQuery("SELECT a.films FROM Actor a WHERE a.actorID = :aI");
        return query.setParameter("aI",actorId).getResultList();
    }

    public Actor getActorByID(int actorId){
        return em.find(Actor.class,actorId);
    }
}
