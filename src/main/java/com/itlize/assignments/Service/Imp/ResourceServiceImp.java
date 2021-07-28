package com.itlize.assignments.Service.Imp;

import com.itlize.assignments.Entity.ProjectResource;
import com.itlize.assignments.Entity.Resource;
import com.itlize.assignments.Repository.ProjectResourceRepository;
import com.itlize.assignments.Repository.ResourceDetailRepository;
import com.itlize.assignments.Repository.ResourceRepository;
import com.itlize.assignments.Service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ResourceServiceImp implements ResourceService {

    @Autowired
    ResourceRepository resourceRepository;

    @Override
    public List<Resource> getAllResources() {
        return resourceRepository.findAll();
    }

    @Override
    public void create(Resource resourceToAdd) {
        resourceRepository.save(resourceToAdd);
    }

    @Override
    public Resource get(Integer resourceId) {
        return resourceRepository.getById(resourceId);
    }

    @Override
    public void delete(Resource resourceToDelete) {
        resourceRepository.delete(resourceToDelete);
    }
}
