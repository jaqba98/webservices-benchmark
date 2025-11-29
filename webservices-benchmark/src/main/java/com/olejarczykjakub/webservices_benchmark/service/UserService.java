package com.olejarczykjakub.webservices_benchmark.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@Service
public class UserService {
    public <TUser> List<TUser> createUsers(Integer size, Function<Integer, TUser> factory) {
        List<TUser> users = new ArrayList<>();
        for (int id = 0; id < size; id++) {
            users.add(factory.apply(id));
        }
        return users;
    }
}
