package org.kingsteff.personal.controller;

import org.flywaydb.core.Flyway;
import org.kingsteff.personal.database.PasswordInfosRepo;
import org.kingsteff.personal.database.UserRepo;
import org.kingsteff.personal.entity.PasswordInfos;
import org.kingsteff.personal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
public class PasswordInfosService {

    @Autowired
    private PasswordInfosRepo passwordrepo;

    @Autowired
    private UserRepo userRepo;

    public void addPassworddForUser(PasswordInfos newPassword){
        passwordrepo.save(newPassword);
    }


    public List<PasswordInfos> getAllPasswordsForUser(String owner){
        return passwordrepo.findAllByOwner(userRepo.findByUsername(owner));
    }

    @PostConstruct
    public void initService(){
    }

}
