package com.example.infoaustria.services;

import com.example.infoaustria.entities.User;
import com.example.infoaustria.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;
    private UserService userService;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        user.setId(0);
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user){
        long id = user.getId();
        User userId = userService.getUserById(id);
        if (userId != null) {
            User newUser = userService.updateUser(userId);
            return userRepository.save(newUser);
        }
        return null; //Exception??
    }

    @Override
    public void deleteUserById(long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(long id) {
        return userRepository.getById(id);
    }

    @Override
    public User getUserByUuid(String uuid) {
        return userRepository.getByUuid(uuid);
    }

    @Override
    public User findUserByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public List<User> findAllUsers(Sort sort) {
        return userRepository.findAll(sort);
    }
}