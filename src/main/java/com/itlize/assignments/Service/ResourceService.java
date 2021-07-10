package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.ProjectResource;
import com.itlize.assignments.Entity.Resource;

public interface ResourceService {

    String getAllJson();

    void create(ProjectResource resourceToAdd);

    Resource get(Integer resourceId);

    boolean delete(Resource resourceToDelete);
}
