package com.example.infoaustria.repository;

import com.example.infoaustria.entities.User;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByLoginAndPassword(String login, String password);

    User findByUuid(String uuid);

    User findById(long id);

    List<User> findAll();

    List<User> findAll(Sort sort);


}
