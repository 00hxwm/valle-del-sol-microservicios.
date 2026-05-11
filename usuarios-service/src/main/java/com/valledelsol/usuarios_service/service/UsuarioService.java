package com.valledelsol.usuarios_service.service;


import com.valledelsol.usuarios_service.model.Usuario;
import com.valledelsol.usuarios_service.repository.UsuarioRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepo usuarioRepository;

    public List<Usuario> listarTodos(){
        return usuarioRepository.findAll();
    }

    public Usuario registrarUsuario(Usuario u){
        if (u.getCorreo() == null || !u.getCorreo().contains("@")){
            throw new RuntimeException("Correo invalido");
        }
        if (u.getNombre() == null || u.getNombre().trim().isEmpty()){
            throw new RuntimeException("el nombre es obligatorio");
        }
        return usuarioRepository.save(u);
    }
}
