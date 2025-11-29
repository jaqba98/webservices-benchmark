package com.olejarczykjakub.webservices_benchmark.rest.controller;

import com.olejarczykjakub.webservices_benchmark.rest.domain.RestHealthDomain;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.path.base}${api.path.rest}")
public class RestHealthController {
    @GetMapping("${api.path.health}")
    public RestHealthDomain getHealth() {
        return new RestHealthDomain();
    }
}
