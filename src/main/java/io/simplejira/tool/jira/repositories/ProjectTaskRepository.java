package io.simplejira.tool.jira.repositories;

import io.simplejira.tool.jira.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
    }


