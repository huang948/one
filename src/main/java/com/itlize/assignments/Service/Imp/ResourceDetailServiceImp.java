package com.itlize.assignments.Service.Imp;

import com.itlize.assignments.Entity.ProjectColumn;
import com.itlize.assignments.Entity.Resource;
import com.itlize.assignments.Entity.ResourceDetail;
import com.itlize.assignments.Service.ResourceDetailService;
import org.springframework.stereotype.Service;

@Service
public class ResourceDetailServiceImp implements ResourceDetailService {

    @Override
    public void create(ResourceDetail rd, Resource resource, ProjectColumn column) {

    }

    @Override
    public ResourceDetail get(Resource resource, ProjectColumn column) {
        return null;
    }

    @Override
    public boolean update(ResourceDetail rd) {
        return false;
    }
}
