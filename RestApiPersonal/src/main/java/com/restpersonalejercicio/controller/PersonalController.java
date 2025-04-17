package com.restpersonalejercicio.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restpersonalejercicio.model.PersonalPC;
import com.restpersonalejercicio.service.PersonalPCService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/personalpcs")
public class PersonalController {

    @Autowired
    private PersonalPCService service;

    @PostMapping
    public ResponseEntity<PersonalPC> create(@RequestBody PersonalPC pc) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.create(pc));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonalPC> read(@PathVariable Integer id) {
        return service.read(id)
            .map(pc -> ResponseEntity.ok(pc))
            .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<PersonalPC> readAll() { return service.readAll(); }

    @PutMapping
    public ResponseEntity<PersonalPC> update(@RequestBody PersonalPC pc) {
        try {
            return ResponseEntity.ok(service.update(pc));
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

