package io.simplejira.tool.jira.repositories;

import io.simplejira.tool.jira.domain.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {

    Iterable<Project> findAllBy(Iterable<Long> iterable);
}
