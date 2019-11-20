package com.sparta.mjn.services;


import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.entities.Film;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Named
@Stateless
public class FilmService {

    @PersistenceContext(unitName = "UserPersistenceUnit")
    private EntityManager em;

    public List<Film> getFilmList()
    {
        return em.createNamedQuery("getFilms", Film.class).getResultList();
    }

    public List<Actor> getActorList(int filmId) {
        Query query = em.createQuery("SELECT f.actorList FROM Film f WHERE f.filmID = :fI");
        return query.setParameter("fI",filmId).getResultList();
    }

    public Film getFilmById(int filmId) {
        return em.find(Film.class, filmId);
    }
}
