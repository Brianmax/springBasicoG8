package com.codigo.spring.controller;

import com.codigo.spring.entity.UsuarioEntity;
import com.codigo.spring.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {
    private UsuarioRepository usuarioRepository;
    
    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    
    @PostMapping("/save")
    public UsuarioEntity saveUsuario(@RequestBody UsuarioEntity usuario){
        UsuarioEntity user = usuarioRepository.save(usuario);
        return user;
    }
}
