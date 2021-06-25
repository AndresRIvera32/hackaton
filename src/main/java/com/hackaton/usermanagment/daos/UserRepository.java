package com.hackaton.usermanagment.daos;

import com.hackaton.usermanagment.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
