package com.jpa.ej7.CRUDvalidacion.Exception;

import lombok.Data;

import java.util.Date;

@Data
public class UnprocessableEntityException extends Exception{

    public UnprocessableEntityException(){
        super();
    }
}
