package io.agilenintelligence.ppmtool.web;


import io.agilenintelligence.ppmtool.domin.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    public ProjectController (ProjectService theProjectService){
        projectService=theProjectService;
    }


    @PostMapping("")
    public ResponseEntity<Project> createNewProject(@Valid @RequestBody Project project){
        Project project1=projectService.saveOrUpdateProject(project);
        return new ResponseEntity<Project>(project, HttpStatus.CREATED);
    }
}