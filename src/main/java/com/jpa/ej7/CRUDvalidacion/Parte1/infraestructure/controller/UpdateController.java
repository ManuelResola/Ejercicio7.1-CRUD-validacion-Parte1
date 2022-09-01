package com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller;

import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpdateController {
    @Autowired
    PersonaServiceImp personaServiceImp;

    @PutMapping("{id}")
    public PersonaOutputDto updatePerson(@PathVariable int id, @RequestBody PersonaInputDto personaInputDto) throws Exception {
        return personaServiceImp.updatePersona(personaInputDto, id);
    }
}
