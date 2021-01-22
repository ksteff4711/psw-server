package org.kingsteff.personal.controller;

import org.kingsteff.personal.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User,Long> {
    User findByLogin(String login);
    User findByLoginAndAndPassword(String login,String password);
    User findByLoginAndCurrentLoginKey(String login,String loginkey);
}
