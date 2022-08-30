package com.jpa.ej7.CRUDvalidacion.Parte1.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Persona implements Serializable {
    @Id
    @GeneratedValue
    Integer id_persona;
    String username;
    String usuario;
    String password;
    String name;
    String surname;
    String company_email;
    String personal_email;
    String city;
    boolean active;
    Date created_date;
    String imagen_url;
    Date termination_date;


    public Boolean getActive() {
        return null;
    }
}
