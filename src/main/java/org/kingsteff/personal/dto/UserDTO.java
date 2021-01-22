package org.kingsteff.personal.dto;

import java.util.UUID;

public class UserDTO {

    private String login;
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
