package com.valledelsol.bff_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v1")
public class BffController {

    @Autowired
    private RestTemplate restTemplate;

    private final String REPORTES_URL = "http://localhost:8081/api/reportes";
    private final String USUARIOS_URL = "http://localhost:8082/api/usuarios";

    @GetMapping("/usuarios")
    public Object obtenerUsuarios() {
        return restTemplate.getForObject(USUARIOS_URL, Object.class);
    }

    @GetMapping("/reportes")
    public Object obtenerReportes() {
        return restTemplate.getForObject(REPORTES_URL, Object.class);
    }
}
