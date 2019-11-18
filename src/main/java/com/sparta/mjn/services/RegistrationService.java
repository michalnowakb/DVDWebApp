package com.sparta.mjn.services;

import com.sparta.mjn.entities.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Named
@RequestScoped
public class RegistrationService
{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String registerUser(User user)
    {
        entityManager.persist(user);
        return "login";
    }
}

