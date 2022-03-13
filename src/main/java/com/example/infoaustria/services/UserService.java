package com.example.infoaustria.services;

import com.example.infoaustria.entities.*;
import org.springframework.data.domain.Sort;

import java.util.List;

///////////////////////////////// User CRUD ///////////////////////////////////

public interface UserService {

    User createUser(User user);

    User updateUser(User user);

    void deleteUserById(long id);

    User getUserById(long id);

    User getUserByUuid(String uuid);

    User findUserByLogin(String login);

    List<User> findAllUsers();

    List<User> findAllUsers(Sort sort);
}
