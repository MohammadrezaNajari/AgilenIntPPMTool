package io.agilenintelligence.ppmtool.services;

import io.agilenintelligence.ppmtool.domin.Project;
import io.agilenintelligence.ppmtool.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository theProjectRepository){
        projectRepository=theProjectRepository;
    }

public Project saveOrUpdateProject(Project project){

        return projectRepository.save(project);
}

}
