package com.olejarczykjakub.webservices_benchmark.rest.domain;

import com.olejarczykjakub.webservices_benchmark.domain.UserDomain;

public record RestUserDomain(UserDomain userDomain) {
    public RestUserDomain(Integer id) {
        this(new UserDomain(id));
    }
}
