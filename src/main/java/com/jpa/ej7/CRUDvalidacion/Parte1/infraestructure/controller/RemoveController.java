package com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller;

import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaService;
import com.jpa.ej7.CRUDvalidacion.Parte1.application.PersonaServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class RemoveController {

        @Autowired
        PersonaServiceImp personaServiceImp;

        @GetMapping("{id}")
        public PersonaOutputDto getPersonaById(@PathVariable int id){
            return personaServiceImp.getPersonaById(id);
        }

        @GetMapping("/name/{name}")
        public List<PersonaOutputDto> getPersonaByName(@PathVariable String name){
            return personaServiceImp.getPersonaByName(name);
        }

        @GetMapping("/todos")
        public List<PersonaOutputDto> getAll(){
            return personaServiceImp.getAllPerson();
        }
    }

