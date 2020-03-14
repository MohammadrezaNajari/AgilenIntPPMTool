package io.agilenintelligence.ppmtool.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class ProjectIdException extends RuntimeException{

    public ProjectIdException(String message){

        super(message);
    }
}
