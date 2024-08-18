package com.Estoque.Estoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Estoque.Estoque.model.Product;
import com.Estoque.Estoque.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Product with id " + id + " not found"));
    }

    public Product createProduct(Product product) {
        // Implementar lógica para criar um novo produto
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        // Implementar lógica para atualizar um produto existente
        product.setId(id);
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        // Implementar lógica para excluir um produto
        productRepository.deleteById(id);
    }
}