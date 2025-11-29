package com.olejarczykjakub.webservices_benchmark.domain;

public record HealthDomain(String status) {
    public HealthDomain() {
        this("ok");
    }
}
