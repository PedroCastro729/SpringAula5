package com.example.springloja.config;

import com.example.springloja.entities.Usuario;
import com.example.springloja.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public record UsuarioDTO(
        Long id,
        String username,
        String role) {
    public UsuarioDTO(Usuario u)
    {
        this(u.getId(), u.getUsername(), u.getRole());
    };
}

