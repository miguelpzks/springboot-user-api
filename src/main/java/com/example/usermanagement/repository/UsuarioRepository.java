package com.example.usermanagement.repository;

import com.example.usermanagement.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Aqui ele irá herdar todos os métodos de CRUD do JpaRepository
}
