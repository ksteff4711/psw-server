package org.kingsteff.personal.dto;

import org.kingsteff.personal.entity.User;

public class UserBuilder {

    public static UserDTO getUserDTOFromUser(User incoming){
        UserDTO result = new UserDTO();
        result.setUsername(incoming.getUsername());
        result.setPassword(incoming.getPassword());
        return result;
    }
}
