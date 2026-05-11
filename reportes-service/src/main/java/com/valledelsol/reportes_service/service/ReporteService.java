package com.valledelsol.reportes_service.service;


import com.valledelsol.reportes_service.factory.ReporteFactory;
import com.valledelsol.reportes_service.model.Reporte;
import com.valledelsol.reportes_service.repository.ReporteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReporteService {
    @Autowired
    private ReporteRepository repository;

    public Reporte registrarReporte(Double latitud, Double longitud, String descripcion, String tipo){

        if (latitud > -17.0 || latitud < -56.0){
            throw new RuntimeException("La latitud esta fuera de Chile");
        }
        if (longitud > -66.0 || longitud < -75.0){
            throw new RuntimeException("la longitud ingresada esta fuera de Chile");
        }
        Reporte nuevoReporte = ReporteFactory.crearReporte(latitud, longitud, tipo, descripcion);
        return repository.save(nuevoReporte);
    }

    public List<Reporte> obtenerTodosLosReportes(){
        return repository.findAll();
    }
}
