package com.sparta.mjn.beans;
import com.sparta.mjn.entities.Actor;
import com.sparta.mjn.entities.Film;
import com.sparta.mjn.services.ActorService;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

@Named
@RequestScoped
public class ActorBean{
    @Inject
    private ActorService actorService;
    private int entityActorId;
    private Actor actorEntity;
    public List<Actor> actorList(){
        return actorService.getActorList();
    }
    public String showActorFilmListPage(int actorId){
        entityActorId = actorId;
        actorEntity = actorService.getActorByID(entityActorId);
        return "actorFilmsPage";
    }
    public List<Film> films(){
        return actorService.getFilms(entityActorId);
    }
}