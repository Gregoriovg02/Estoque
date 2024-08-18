package com.Estoque.Estoque.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Estoque.Estoque.model.Location;
import com.Estoque.Estoque.repository.LocationRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class LocationService {
    private final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    public Location getLocationById(Long id) {
        return locationRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Location with id " + id + " not found"));
    }

    public Location createLocation(Location location) {
        // Implementar lógica para criar uma nova localidade
        return locationRepository.save(location);
    }

    public Location updateLocation(Long id, Location location) {
        // Implementar lógica para atualizar uma localidade existente
        location.setId(id);
        return locationRepository.save(location);
    }

    public void deleteLocation(Long id) {
        // Implementar lógica para excluir uma localidade
        locationRepository.deleteById(id);
    }
}