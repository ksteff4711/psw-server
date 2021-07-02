package org.kingsteff.personal.rest;

import org.kingsteff.personal.controller.PasswordInfosService;
import org.kingsteff.personal.dto.PasswordInfosBuilder;
import org.kingsteff.personal.dto.PasswordInfosDTO;
import org.kingsteff.personal.entity.PasswordInfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
public class PasswordInfosRestController {

   @Autowired
    PasswordInfosService service;

    public PasswordInfosRestController(){

    }

    @GetMapping(path="passwordList/{username}")
    public ResponseEntity<List<PasswordInfosDTO>> getPasswordList(@PathVariable("username") String userName){
        return ResponseEntity.ok(PasswordInfosBuilder.getPasswordInfosDTOFromPasswordInfoList(service.getAllPasswordsForUser(userName)));
    }

    @PostMapping(path="password")
    public ResponseEntity<PasswordInfos> addPasswords(@RequestHeader("login-key") String language, @RequestBody PasswordInfosDTO newInfos){
        return null;
    }



}
