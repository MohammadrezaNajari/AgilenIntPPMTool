package io.agilenintelligence.ppmtool.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.jws.WebResult;

@RestController
@ResponseStatus
public class ResponseEntityExceptionHandler extends org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler {



    @ExceptionHandler
    public final ResponseEntity<Object>  handleProjectIdException(ProjectIdException ex, WebResult webResult){

            ProjectExceptionResponse projectExceptionResponse=new ProjectExceptionResponse(ex.getMessage());
            return new ResponseEntity(projectExceptionResponse, HttpStatus.BAD_REQUEST);



    }
}
