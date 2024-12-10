package com.codigo.spring.repository;

import com.codigo.spring.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {
}
