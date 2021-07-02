package org.kingsteff.personal.dto;

import org.kingsteff.personal.entity.PasswordInfos;

import java.util.List;
import java.util.stream.Collectors;

public class PasswordInfosBuilder {

    public static PasswordInfosDTO getPasswordInfosDTOFromPasswordInfo(PasswordInfos input){
        PasswordInfosDTO result = new PasswordInfosDTO();
        result.setComment(input.getComment());
        result.setPassword(input.getPassword());
        result.setCreationdate(input.getCreationdate());
        result.setLabel(input.getLabel());
        result.setLocation(input.getLocation());
        result.setWebsite(input.getWebsite());
        result.setLogin(input.getLogin());
        return  result;
    }

    public static List<PasswordInfosDTO> getPasswordInfosDTOFromPasswordInfoList(List<PasswordInfos> allPasswordsForUser) {
        return allPasswordsForUser.stream().map(e -> getPasswordInfosDTOFromPasswordInfo(e)).collect(Collectors.toList());
    }
}
