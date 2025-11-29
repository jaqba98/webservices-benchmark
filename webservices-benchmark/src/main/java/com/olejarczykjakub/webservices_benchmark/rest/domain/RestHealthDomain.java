package com.olejarczykjakub.webservices_benchmark.rest.domain;

import com.olejarczykjakub.webservices_benchmark.domain.HealthDomain;

public record RestHealthDomain(HealthDomain healthDomain) {
    public RestHealthDomain() {
        this(new HealthDomain());
    }
}
