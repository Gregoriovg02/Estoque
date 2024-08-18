package com.Estoque.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Estoque.Estoque.model.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    // Métodos de consulta personalizados, se necessário
}