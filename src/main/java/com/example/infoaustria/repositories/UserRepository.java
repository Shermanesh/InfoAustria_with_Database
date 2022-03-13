package com.example.infoaustria.repositories;

import com.example.infoaustria.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User getByUuid(String uuid);

    User findByLogin(String login);
}
