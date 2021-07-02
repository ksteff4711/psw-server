package org.kingsteff.personal.database;

import org.kingsteff.personal.entity.PasswordInfos;
import org.kingsteff.personal.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PasswordInfosRepo extends CrudRepository<PasswordInfos, Long> {

    List<PasswordInfos> findAllByOwner(User owner);
}
