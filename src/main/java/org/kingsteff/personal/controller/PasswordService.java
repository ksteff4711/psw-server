package org.kingsteff.personal.controller;

import org.kingsteff.personal.entity.PasswordInfos;
import org.kingsteff.personal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class PasswordService {

    @Autowired
    private PasswordRepo passwordrepo;

    public void addPassworddForUser(PasswordInfos newPassword){
        passwordrepo.save(newPassword);
    }
    public List<PasswordInfos> getAllPasswordsForUser(User owner){
        return passwordrepo.findAllByOwner(owner);
    }

}
