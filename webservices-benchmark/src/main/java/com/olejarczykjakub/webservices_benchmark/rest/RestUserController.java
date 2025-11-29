package com.olejarczykjakub.webservices_benchmark.rest;

import com.olejarczykjakub.webservices_benchmark.domain.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rest")
public class RestUserController {
    @GetMapping("/users")
    public List<RestUser> getUsers(@RequestParam(name = "size", defaultValue = "50") Integer size) {
        List<RestUser> users = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Integer id = i;
            String firstName = "User first name " + i;
            String lastName = "User last name " + i;
            String email = "user" + i + "@example.com";
            String city = "City " + i;
            User user = new User(id, firstName, lastName, email, city);
            users.add(new RestUser(user));
        }
        return users;
    }
}
