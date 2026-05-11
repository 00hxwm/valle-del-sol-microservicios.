package com.valledelsol.bff_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class BffController {

    @Autowired
    private RestTemplate restTemplate;

    private final String REPORTES_URL = "http://localhost:8081/api/reportes";
    private final String USUARIOS_URL = "http://localhost:8082/api/usuarios";

    @GetMapping("/reportes")
    public Object obtenerReportes() {
        try{
            return restTemplate.getForObject(REPORTES_URL, Object.class);
        } catch (Exception e){
            return Map.of("error","el servicio de usuarios no responde");
        }
    }

    @GetMapping("/usuarios")
    public Object obtenerUsuarios() {
        try{
            return restTemplate.getForObject(USUARIOS_URL, Object.class);
        } catch (Exception e){
            return Map.of("error", "sevicio de usuarios no responde");
        }
    }

    @PostMapping("/reportes")
    public Object crearReporte(@RequestBody Object reporteJson){
        try{
            return restTemplate.postForObject(REPORTES_URL, reporteJson, Object.class);
        } catch (Exception e){
            return Map.of("error", "no se pudo enviar el reporte");
        }
    }
}
