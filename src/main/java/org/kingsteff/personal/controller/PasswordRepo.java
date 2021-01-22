package org.kingsteff.personal.controller;

import org.kingsteff.personal.entity.PasswordInfos;
import org.kingsteff.personal.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasswordRepo extends CrudRepository<PasswordInfos, Long> {

    List<PasswordInfos> findAllByOwner(User owner);
}
