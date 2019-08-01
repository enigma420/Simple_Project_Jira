package io.simplejira.tool.jira.services;


import io.simplejira.tool.jira.domain.Project;
import io.simplejira.tool.jira.exceptions.ProjectIdException;
import io.simplejira.tool.jira.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProject(Project project){
        try{
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase());
            return projectRepository.save(project);
        }catch (Exception e){
            throw new ProjectIdException("Project ID '"+project.getProjectIdentifier().toUpperCase()+"' already exists");
        }

    }

}