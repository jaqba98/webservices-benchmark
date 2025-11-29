package com.olejarczykjakub.webservices_benchmark.domain;

public record UserDomain(Integer id, String firstName, String lastName, String email, String city) {
    public UserDomain(Integer id) {
        this(id, "John" + id, "Smith" + id, "john.smith" + id + "@example.com", "Miami");
    }
}
