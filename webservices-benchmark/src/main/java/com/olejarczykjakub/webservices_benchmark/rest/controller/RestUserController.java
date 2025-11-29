package com.olejarczykjakub.webservices_benchmark.rest.controller;

import com.olejarczykjakub.webservices_benchmark.rest.domain.RestUserDomain;
import com.olejarczykjakub.webservices_benchmark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${api.path.base}${api.path.rest}")
public class RestUserController {
    private final UserService userService;

    @Autowired
    public RestUserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("${api.path.users}")
    public List<RestUserDomain> getUsers(@RequestParam(defaultValue = "50") Integer size) {
        return userService.createUsers(size, RestUserDomain::new);
    }
}
