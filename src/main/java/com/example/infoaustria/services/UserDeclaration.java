package com.example.infoaustria.services;

import com.example.infoaustria.entities.*;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface UserDeclaration {

    User findUserByLoginAndPassword(String login, String password);

    User findUserByUuid(String uuid);

    User findUserById(long id);

    List<User> findAllUser();

    List<User> findAllUser(Sort sort);
}
