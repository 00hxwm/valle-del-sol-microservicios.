package com.valledelsol.usuarios_service.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table (name = "usuarios")

public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;

    private String nombre;
    private String rol;
    private String correo;
}
