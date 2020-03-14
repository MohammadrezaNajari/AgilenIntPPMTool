package io.agilenintelligence.ppmtool.services;

import io.agilenintelligence.ppmtool.domin.Project;
import io.agilenintelligence.ppmtool.exception.ProjectIdException;
import io.agilenintelligence.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository theProjectRepository) {
        projectRepository = theProjectRepository;
    }

    public Project saveOrUpdateProject(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project ID '" + project.getProjectIdentifier().toUpperCase() + "' already exists");
        }
    }

    public Iterable<Project> findAll(){
        return projectRepository.findAll();
    }


}


