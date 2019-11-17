package com.sparta.mjn.services;


import com.sparta.mjn.entities.Film;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Named
@Stateless
public class FilmService {
    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jdbc/__sakila");

    @PersistenceContext
    EntityManager entityManager;

    public List getFilmDetails(Film film) {
        Query query = entityManager.createNativeQuery("SELECT f.title, f.rating FROM film f", Film.class);
        return query.getResultList();
    }


//    @ManyToMany
//    @JoinTable(
//            name = "film",
//            joinColumns = @JoinColumn(name = "film_id"),
//            inverseJoinColumns = @JoinColumn(name = "actor_id"))
//    Set<Film> filmCast;

}
