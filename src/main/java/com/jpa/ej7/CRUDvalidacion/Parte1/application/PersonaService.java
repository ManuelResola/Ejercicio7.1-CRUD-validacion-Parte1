package com.jpa.ej7.CRUDvalidacion.Parte1.application;

import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaInputDto;
import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaOutputDto;

import java.util.List;

public interface PersonaService {

    public PersonaOutputDto getPersona();

    public PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception;

    public PersonaOutputDto updatePersona(PersonaInputDto personaInputDto, int id) throws Exception;

    public void deletePersonaById(int id);

    public abstract PersonaOutputDto getPersonaById(int id);

    String deletePersona(int id) throws Exception;

    PersonaOutputDto findPersonaById(int id) throws Exception;

    public List<PersonaOutputDto> getPersonaByName(String name);

    public List<PersonaOutputDto> getAllPerson();

    PersonaOutputDto addPerson(PersonaInputDto newPersonaDto) throws Exception;
}

