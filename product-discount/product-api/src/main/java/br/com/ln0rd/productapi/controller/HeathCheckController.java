package br.com.ln0rd.productapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HeathCheckController {

    @GetMapping
    public Boolean getHealthCheck() {
        return true;
    }
}
