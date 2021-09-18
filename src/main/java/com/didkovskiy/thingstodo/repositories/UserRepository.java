package com.didkovskiy.thingstodo.repositories;

import com.didkovskiy.thingstodo.domains.userstore.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
    List<User> findAll();

}