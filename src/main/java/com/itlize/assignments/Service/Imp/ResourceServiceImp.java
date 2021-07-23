package com.itlize.assignments.Service.Imp;

import com.itlize.assignments.Entity.ProjectResource;
import com.itlize.assignments.Entity.Resource;
import com.itlize.assignments.Service.ResourceService;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImp implements ResourceService {

    @Override
    public String getAllJson() {
        return null;
    }

    @Override
    public void create(ProjectResource resourceToAdd) {

    }

    @Override
    public Resource get(Integer resourceId) {
        return null;
    }

    @Override
    public boolean delete(Resource resourceToDelete) {
        return false;
    }
}
