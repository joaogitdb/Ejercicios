package com.empresa.eclipselinkcrud.repository;


import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.empresa.eclipselinkcrud.entity.Producto;

@Repository
@Transactional
public class ProductoRepositoryImpl implements ProductoRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Producto> findAll() {
        return em.createQuery("SELECT p FROM Producto p", Producto.class)
                 .getResultList();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return Optional.ofNullable(em.find(Producto.class, id));
    }

    @Override
    public Producto save(Producto producto) {
        if (producto.getId() == null) {
            em.persist(producto);
            return producto;
        } else {
            return em.merge(producto);
        }
    }

    @Override
    public void deleteById(Long id) {
        Producto p = em.find(Producto.class, id);
        if (p != null) {
            em.remove(p);
        }
    }
}