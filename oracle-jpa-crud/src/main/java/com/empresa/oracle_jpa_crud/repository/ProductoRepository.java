package com.empresa.oracle_jpa_crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.empresa.oracle_jpa_crud.entity.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
