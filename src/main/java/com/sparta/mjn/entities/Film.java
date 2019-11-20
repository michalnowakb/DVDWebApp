package com.sparta.mjn.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "film")

@NamedQuery(
        name = "getFilms",
        query = "SELECT f FROM Film f"
)
public class Film {
    @Id
    @Column(name = "film_id")
    private int filmID;

    @Column(name = "title")
    private String filmTitle;

    @Column(name = "description")
    private String filmDescription;

    @Column(name = "release_year")
    private int releaseYear;

    @Column(name = "language_id")
    private int languageID;

    @Column(name = "original_language_id")
    private int originalLanguageID;

    @Column(name = "rental_duration")
    private int rentalDuration;

    @Column(name = "rental_rate")
    private float rentalRate;

    @Column(name = "length")
    private int filmLength;

    @Column(name = "replacement_cost")
    private float replacementCost;

    @Column(name = "rating")
    private String filmRating;

    @Column(name = "special_features")
    private String specialFeatures;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    @ManyToMany(mappedBy = "films")
    private Set<Actor> actorList;

    public Set<Actor> getActorList() {
        return actorList;
    }


    public int getFilmID() {
        return filmID;
    }

    public void setFilmID(int filmID) {
        this.filmID = filmID;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public int getOriginalLanguageID() {
        return originalLanguageID;
    }

    public void setOriginalLanguageID(int originalLanguageID) {
        this.originalLanguageID = originalLanguageID;
    }

    public int getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(int rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public float getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(float rentalRate) {
        this.rentalRate = rentalRate;
    }

    public int getFilmLength() {
        return filmLength;
    }

    public void setFilmLength(int filmLength) {
        this.filmLength = filmLength;
    }

    public float getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(float replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getFilmRating() {
        return filmRating;
    }

    public void setFilmRating(String filmRating) {
        this.filmRating = filmRating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}