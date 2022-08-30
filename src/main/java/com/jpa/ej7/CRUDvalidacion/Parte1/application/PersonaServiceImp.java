package com.jpa.ej7.CRUDvalidacion.Parte1.application;

import com.jpa.ej7.CRUDvalidacion.Parte1.domain.Persona;
import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaInputDto;
import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.controller.PersonaOutputDto;
import com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.repository.PersonaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImp extends PersonaService {

    PersonaInputDto personaInputDto = new PersonaInputDto();

    PersonaOutputDto personaOutputDto;

    @Autowired
    PersonaRepositorio personaRepositorio;

    @Override
    public PersonaOutputDto getPersona() {
        return personaOutputDto;
    }

    @Override
    public PersonaOutputDto addPersona(PersonaInputDto personaInputDto) throws Exception {
        personaInputDto.setCreated_date(new Date());

        if (personaInputDto.getUsuario()==null){
            throw new Exception("el usuario no puede ser nulo");
        }
        if (personaInputDto.getUsuario().length()>10){
            throw new Exception("no puede tener mas de 10 caracteres");
        }
        if (personaInputDto.getUsuario().length()<6){
            throw new Exception("no puede tener menos de 6 caracteres");
        }
        if (personaInputDto.getPassword()==null){
            throw new Exception("la contraseña no puede ser vacia");
        }
        if(personaInputDto.getName()==null){
            throw new Exception("no puede ser null el nombre");
        }
        if (personaInputDto.getCompany_email()==null){
            throw new Exception("no puede ser null el email de compañia");
        }
        if (!personaInputDto.getCompany_email().contains("@")){
            throw new Exception("debe de ser un email");
        }
        if (personaInputDto.getPersonal_email()==null){
            throw  new Exception("no puede ser null el email personal");
        }
        if (!personaInputDto.getPersonal_email().contains("@")){
            throw new Exception("debe de ser un email");
        }
        if(personaInputDto.getCity()==null){
            throw new Exception("por favor introduzca una ciudad");
        }
        if (personaInputDto.getActive()==null){
            throw new Exception("introduzca un valor");
        }

        Persona persona = personaInputDto.personaInPut();

        personaRepositorio.save(persona);

        return new PersonaOutputDto(persona);

    }

    @Override
    public PersonaOutputDto updatePersona(PersonaInputDto personaInputDto, int id) throws Exception {
        Optional<Persona> personaOpt = personaRepositorio.findById(id);
        Persona persona;

        if(personaOpt.isEmpty()){
            throw new Exception("esta mal");
        }

        persona = personaOpt.get();
        persona.setUsuario(personaInputDto.getUsuario());
        persona.setPassword(personaInputDto.getPassword());
        persona.setName(personaInputDto.getName());
        persona.setSurname(personaInputDto.getSurname());
        persona.setCompany_email(personaInputDto.getCompany_email());
        persona.setPersonal_email(personaInputDto.getPersonal_email());
        persona.setCity(personaInputDto.getCity());
        persona.setActive(personaInputDto.getActive());
        persona.setCreated_date(personaInputDto.getCreated_date());
        persona.setImagen_url(personaInputDto.getImagen_url());

        personaRepositorio.save(persona);

        return new PersonaOutputDto(persona);
    }

    @Override
    public void deletePersonaById(int id) {

        personaRepositorio.deleteById(id);

    }

    @Override
    public PersonaOutputDto getPersonaById(int id) {
        Optional<Persona> personaOpt = personaRepositorio.findById(id);
        Persona persona = personaOpt.get();

        return new PersonaOutputDto(persona);
    }

    @Override
    public List<PersonaOutputDto> getPersonaByName(String name) {
        List<Persona> personas = personaRepositorio.findByName(name);
        List<PersonaOutputDto> personasOutPutDto;

        personasOutPutDto = personas.stream().map(persona -> new PersonaOutputDto(persona)).collect(Collectors.toList());

        return personasOutPutDto;
    }

    @Override
    public List<PersonaOutputDto> getAllPerson(){
        List<Persona> personas = personaRepositorio.findAll();
        List<PersonaOutputDto> personasOutPutDto;

        personasOutPutDto = personas.stream().map(persona -> new PersonaOutputDto(persona)).collect(Collectors.toList());

        return personasOutPutDto;
    }

    @Override
    public PersonaOutputDto addPerson(PersonaInputDto newPersonaDto) throws Exception {
        return null;
    }

    public void findPersonById(int id) {
    }
}