package com.hackaton.usermanagment.daos;

import com.hackaton.usermanagment.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<String, User> {
}
