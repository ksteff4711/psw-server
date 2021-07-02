package org.kingsteff.personal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordApplication {

    public static void main(String args[]){

        System.out.println("PATH--->>"+System.getProperties().get("java.class.path"));
        SpringApplication.run(PasswordApplication.class,args);
    }
}
