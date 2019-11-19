package com.sparta.mjn.services;

import com.sparta.mjn.entities.User;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.Collection;

@Named
@RequestScoped
public class RegistrationService
{
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public String registerUser(User user)
    {
        if(isAlreadyAUser(user))
        {
            return "register";
        }
        else
        {
        entityManager.persist(user);
        return "login";
        }
    }

    private boolean isAlreadyAUser(User user)
    {
        Collection entityHolder = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.username LIKE :userName AND u.password LIKE :password")
                .setParameter("userName", user.getUsername())
                .setParameter("password", user.getPassword())
                .getResultList();

        if(!entityHolder.isEmpty()) { return true; }
        else {return false ;}
    }
}

