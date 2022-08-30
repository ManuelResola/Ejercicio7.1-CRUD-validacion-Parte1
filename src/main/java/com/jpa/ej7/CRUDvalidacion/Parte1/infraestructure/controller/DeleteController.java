package com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller;

import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeleteController {
    @Autowired
    PersonaService personaService;

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable int id) throws Exception{
        personaService.deletePersonaById(id);
    }
}
