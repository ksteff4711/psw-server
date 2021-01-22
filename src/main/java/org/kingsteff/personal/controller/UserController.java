package org.kingsteff.personal.controller;

import org.kingsteff.personal.dto.UserDTO;
import org.kingsteff.personal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserController {


    UserRepo userRepo;

    public UserController(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    public User getUserByLogin(String login){
        return userRepo.findByLogin(login);
    }


    public User getUser(UserDTO incoming){
        throw new RuntimeException("not yet implemented");
    }

    public User getUserForLogin(UserDTO incomingUserData){
        User byLogin = userRepo.findByLogin(incomingUserData.getLogin());
        byLogin.setCurrentLoginKey(UUID.randomUUID());
        userRepo.save(byLogin);
        return byLogin;
    }
}
