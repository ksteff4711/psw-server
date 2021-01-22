package org.kingsteff.personal.dto;

import org.kingsteff.personal.entity.User;

public class UserBuilder {

    public static UserDTO getUserDTOFromUser(User incoming){
        UserDTO result = new UserDTO();
        result.setLogin(incoming.getLogin());
        result.setPassword(incoming.getPassword());
        return result;
    }
}
