package com.sparta.mjn.services;


import com.sparta.mjn.entities.User;

import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Named
@Stateless
public class RegistrationService {

    @PersistenceContext
     private EntityManager entityManager;

    public String registerUser(User user){
        if(user.getPassword().isEmpty() ||
                user.getLastName().isEmpty() ||
                user.getFirstName().isEmpty() ||
                user.getUserName().isEmpty() ){
            return "error";
        } else {

            entityManager.persist(user);


            return "welcomeNewUser";
        }
    }
}
