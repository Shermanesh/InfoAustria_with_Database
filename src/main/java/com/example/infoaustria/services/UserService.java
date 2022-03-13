package com.example.infoaustria.services;

import com.example.infoaustria.entities.User;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class UserService implements UserDeclaration {

    @Override
    public User findUserByLoginAndPassword(String login, String password) {
        return null;
    }

    @Override
    public User findUserByUuid(String uuid) {
        return null;
    }

    @Override
    public User findUserById(long id) {
        return null;
    }

    @Override
    public List<User> findAllUser() {
        return null;
    }

    @Override
    public List<User> findAllUser(Sort sort) {
        return null;
    }
}