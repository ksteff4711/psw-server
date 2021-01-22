package org.kingsteff.personal.rest;

import org.kingsteff.personal.controller.UserController;
import org.kingsteff.personal.dto.UserBuilder;
import org.kingsteff.personal.dto.UserDTO;
import org.kingsteff.personal.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserController userController;

    @PostMapping(path="loginUser")
    public ResponseEntity<UserDTO> loginUser(UserDTO incomingData){
        User user = userController.getUserForLogin(incomingData);
        if(user!=null){
            return ResponseEntity.ok(UserBuilder.getUserDTOFromUser(user));
        }
        return ResponseEntity.notFound().build();
    }
}
