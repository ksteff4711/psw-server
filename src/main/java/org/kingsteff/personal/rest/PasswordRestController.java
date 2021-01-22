package org.kingsteff.personal.rest;

import org.kingsteff.personal.dto.PasswordDTO;
import org.kingsteff.personal.entity.PasswordInfos;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PasswordRestController {

    public PasswordRestController(){

    }

    @GetMapping(path="passwordList")
    public ResponseEntity<List<PasswordDTO>> getPasswordList(){
        return null;
    }

    @PostMapping(path="password")
    public ResponseEntity<PasswordInfos> addPasswords(@RequestHeader("login-key") String language, @RequestBody PasswordDTO newInfos){
        //loginkey vom Usercontroller holen
    }

}
