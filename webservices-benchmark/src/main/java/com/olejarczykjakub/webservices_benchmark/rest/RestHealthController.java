package com.olejarczykjakub.webservices_benchmark.rest;

import com.olejarczykjakub.webservices_benchmark.domain.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/rest")
public class RestHealthController {
    @GetMapping("/health")
    public RestHealth getHealth() {
        Health health = new Health("ok");
        return new RestHealth(health);
    }
}
