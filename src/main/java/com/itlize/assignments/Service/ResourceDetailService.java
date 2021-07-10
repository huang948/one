package com.itlize.assignments.Service;

import com.itlize.assignments.Entity.ProjectColumn;
import com.itlize.assignments.Entity.Resource;
import com.itlize.assignments.Entity.ResourceDetail;

public interface ResourceDetailService {

    void create(ResourceDetail rd, Resource resource, ProjectColumn column);

     ResourceDetail get(Resource resource, ProjectColumn column);

    boolean update(ResourceDetail rd);
}
