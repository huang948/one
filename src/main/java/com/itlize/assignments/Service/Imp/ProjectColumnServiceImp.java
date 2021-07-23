package com.itlize.assignments.Service.Imp;

import com.itlize.assignments.Entity.ProjectColumn;
import com.itlize.assignments.Repository.ProjectColumnRepository;
import com.itlize.assignments.Service.ProjectColumnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectColumnServiceImp implements ProjectColumnService {
    @Autowired
    ProjectColumnRepository projectColumnRepository;

    @Override
    public String getColumnsJson(Object o) {
        return null;
    }

    @Override
    public boolean create(ProjectColumn projectColumn){
        return false;
    }

    @Override
    public ProjectColumn get(Object o, String columnName) {
        return null;
    }

    @Override
    public boolean delete(ProjectColumn columnToDelete) {
        return false;
    }

    @Override
    public boolean update(ProjectColumn columnToUpdate, String newColumnName) {
        return false;
    }

    @Override
    public ProjectColumn get(Integer columnId) {
        return null;
    }

}
