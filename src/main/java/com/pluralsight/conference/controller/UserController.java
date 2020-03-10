package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstName", defaultValue = "Rufin") String firstName,
                        @RequestParam(value = "lastName", defaultValue = "Hounkpe") String lastName,
                        @RequestParam(value = "age", defaultValue = "43") int age) {
        User user = new User();

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);

        return user;
    }

    @PostMapping("/user")
    public User createUser(User user) {
        System.out.println("User firstName: " + user.getFirstName());
        return user;
    }
}
