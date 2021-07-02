package org.kingsteff.personal.rest;

import org.kingsteff.personal.dto.PasswordInfosDTO;
import org.kingsteff.personal.entity.PasswordInfos;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class PasswordInfosRestController {

    public PasswordInfosRestController(){

    }

    @GetMapping(path="passwordList")
    public ResponseEntity<List<PasswordInfosDTO>> getPasswordList(){
        return null;
    }

    @PostMapping(path="password")
    public ResponseEntity<PasswordInfos> addPasswords(@RequestHeader("login-key") String language, @RequestBody PasswordInfosDTO newInfos){
        return null;
    }



}
