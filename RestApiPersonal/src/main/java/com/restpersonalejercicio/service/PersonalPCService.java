package com.restpersonalejercicio.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restpersonalejercicio.model.PersonalPC;
import com.restpersonalejercicio.model.PersonalPCDao;

@Service
public class PersonalPCService {
    
    @Autowired
    private PersonalPCDao dao;

    public PersonalPC create(PersonalPC pc) { return dao.save(pc); }

    public Optional<PersonalPC> read(Integer id) { return dao.findById(id); }

    public List<PersonalPC> readAll() { return dao.findAll(); }

    public PersonalPC update(PersonalPC pc) {
        if(pc.getId() == null || !dao.existsById(pc.getId()))
            throw new RuntimeException("PC no encontrado para actualizar");
        return dao.save(pc);
    }

    public void delete(Integer id) { dao.deleteById(id); }
}
