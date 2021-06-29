package com.itlize.assignments.Repository;

import com.itlize.assignments.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {

}
