package io.agilenintelligence.ppmtool.exception;


import org.springframework.web.bind.annotation.ResponseStatus;

public class ProjectExceptionResponse {
private String projectIdentifier;


public ProjectExceptionResponse(String projectIdentifier) {
  this.projectIdentifier = projectIdentifier;
}


  public String getProjectIdentifier() {
    return projectIdentifier;
  }

  public void setProjectIdentifier(String projectIdentifier) {
    this.projectIdentifier = projectIdentifier;
  }
}

