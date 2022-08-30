package com.jpa.ej7.CRUDvalidacion.Parte1.application;

import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaInputDto;
import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaOutputDto;

import java.util.List;

public abstract class PersonaService {

    public PersonaOutputDto getPersona() {
        return null;
    }

    public PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception {
        return null;
    }

    public PersonaOutputDto updatePersona(PersonaInputDto personaInputDto, int id) throws Exception {
        return null;
    }

    public void deletePersonaById(int id) {

    }

    public abstract PersonaOutputDto getPersonaById(int id);

    public List<PersonaOutputDto> getPersonaByName(String name) {
        return null;
    }

    public List<PersonaOutputDto> getAllPerson() {
        return null;
    }

    public abstract PersonaOutputDto addPerson(PersonaInputDto newPersonaDto) throws Exception;
}