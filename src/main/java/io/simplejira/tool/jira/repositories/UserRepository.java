package io.simplejira.tool.jira.repositories;

import io.simplejira.tool.jira.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
