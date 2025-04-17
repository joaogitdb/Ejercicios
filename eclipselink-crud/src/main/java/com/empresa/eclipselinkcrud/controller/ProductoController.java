package com.empresa.eclipselinkcrud.controller;

import java.net.URI;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.empresa.eclipselinkcrud.entity.Producto;
import com.empresa.eclipselinkcrud.repository.ProductoRepository;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    private final ProductoRepository repo;

    public ProductoController(ProductoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Producto> all() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Producto> one(@PathVariable Long id) {
        return repo.findById(id)
                   .map(ResponseEntity::ok)
                   .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Producto> create(@RequestBody Producto p) {
        Producto saved = repo.save(p);
        return ResponseEntity
                .created(URI.create("/api/productos/" + saved.getId()))
                .body(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Producto> update(@RequestBody Producto p, @PathVariable Long id) {
        p.setId(id);
        return ResponseEntity.ok(repo.save(p));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
