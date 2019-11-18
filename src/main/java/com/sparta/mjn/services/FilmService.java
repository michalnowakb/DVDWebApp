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

    @PersistenceContext(unitName = "UserPersistenceUnit")
    private EntityManager em;

    public List getFilmList() {
//        return em.createNamedQuery("getFilms", Film.class).getResultList();
        return em.createQuery("select f from Film f", Film.class).getResultList();
    }

    public String requestActors() {
        return "actors";


}


//    @ManyToMany
//    @JoinTable(
//            name = "film",
//            joinColumns = @JoinColumn(name = "film_id"),
//            inverseJoinColumns = @JoinColumn(name = "actor_id"))
//    Set<Film> filmCast;

}
