package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.ProjectResource;
import com.itlize.assignments.Entity.Resource;

import java.util.List;

public interface ResourceService {

    List<Resource> getAllResources();

    void create(Resource resourceToAdd);

    Resource get(Integer resourceId);

    void deleteResourceById(Integer resourceId);
}
