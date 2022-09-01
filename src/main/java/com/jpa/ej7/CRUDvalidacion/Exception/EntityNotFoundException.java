package com.jpa.ej7.CRUDvalidacion.Exception;

import lombok.Data;

import java.util.Date;

@Data
public class EntityNotFoundException extends Exception{

    Date timeStamp;
    int httpCode;

    public EntityNotFoundException(String message, int httpCode){
        super(message);
        setTimeStamp(new Date());
        setHttpCode(httpCode);
    }
}