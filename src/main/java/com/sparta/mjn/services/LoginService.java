package com.sparta.mjn.services;


import com.sparta.mjn.entities.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

public class LoginService
{
    @PersistenceContext
    private EntityManager entityManager;

    public String validateUser(User user)
    {
        Collection entityHolder = entityManager.createQuery(
                "SELECT u FROM User u WHERE u.username LIKE :userName AND u.password LIKE :password")
                .setParameter("userName", user.getUsername())
                .setParameter("password", user.getPassword())
                .getResultList();

        if(!entityHolder.isEmpty()) { return "welcome"; }

        return "login";
    }
}
