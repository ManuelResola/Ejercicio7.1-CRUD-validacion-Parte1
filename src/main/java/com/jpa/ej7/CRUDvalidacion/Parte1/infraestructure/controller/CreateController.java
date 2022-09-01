package com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller;

import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaService;
import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateController {

    @Autowired
    PersonaService personaService;

    @PostMapping
    public PersonaOutputDto addPersona(@RequestBody PersonaInputDto personaInputDto) throws Exception{
        return personaService.addPersona(personaInputDto);
    }
}