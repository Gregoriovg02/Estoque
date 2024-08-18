package com.Estoque.Estoque.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Estoque.Estoque.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Métodos de consulta personalizados, se necessário
}