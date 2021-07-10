package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.ProjectColumn;

public interface ProjectColumnService {

    String getColumnsJson(Object o);

    boolean create(ProjectColumn columnToAdd);

    ProjectColumn get(Object o, String columnName);

    boolean delete(ProjectColumn columnToDelete);

    boolean update(ProjectColumn columnToUpdate, String newColumnName);

    ProjectColumn get(Integer columnId);
}
