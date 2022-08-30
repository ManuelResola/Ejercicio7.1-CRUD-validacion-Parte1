package com.jpa.ej7.CRUDvalidacion.Parte1.infraestructure.repository;

import com.jpa.ej7.CRUDvalidacion.Parte1.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PersonaRepositorio extends JpaRepository<Persona, Integer> {

    @Query
    List<Persona> findByName(String name);
}
