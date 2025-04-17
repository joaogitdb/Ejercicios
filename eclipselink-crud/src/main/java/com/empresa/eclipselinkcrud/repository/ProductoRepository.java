package com.empresa.eclipselinkcrud.repository;

import java.util.List;
import java.util.Optional;

import com.empresa.eclipselinkcrud.entity.Producto;

public interface ProductoRepository {
    List<Producto> findAll();
    Optional<Producto> findById(Long id);
    Producto save(Producto producto);
    void deleteById(Long id);
}