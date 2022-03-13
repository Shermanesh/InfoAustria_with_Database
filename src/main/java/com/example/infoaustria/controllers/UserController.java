package com.example.infoaustria.controllers;

import com.example.infoaustria.entities.User;
import com.example.infoaustria.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Scope("prototype")
@CrossOrigin(origins = "*", allowCredentials = "true")
@RequestMapping("api/user")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping("updateUser")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        User updateUser = userService.updateUser(user);
        return ResponseEntity.ok(updateUser);
    }
}
