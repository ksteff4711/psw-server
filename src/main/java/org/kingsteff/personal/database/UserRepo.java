package org.kingsteff.personal.database;

import org.kingsteff.personal.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepo extends CrudRepository<User,Long> {
    User findByUsername(String username);
}
