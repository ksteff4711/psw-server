package org.kingsteff.personal.dto;

import java.util.UUID;

public class UserDTO {

    private String username;
    private String password;
    private UUID loginKey;


    public UserDTO() {
    }

    public UUID getLoginKey() {
        return loginKey;
    }

    public void setLoginKey(UUID loginKey) {
        this.loginKey = loginKey;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
