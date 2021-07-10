package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Resource {

    @Id
    @GeneratedValue
    private Integer resourceId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    @OneToMany(mappedBy = "resource")
    private List<ProjectResource> projectResources;

    @OneToMany(mappedBy = "resource")
    private List<ResourceDetail> resourceDetails;

    public Resource() {

    }

    public Resource(LocalDateTime timeCreated, LocalDateTime lastUpdated, List<ProjectResource> projectResources, List<ResourceDetail> resourceDetails) {
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.projectResources = projectResources;
        this.resourceDetails = resourceDetails;
    }

    public Integer getResourceId() {
        return resourceId;
    }

    public void setResourceId(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<ProjectResource> getProjectResources() {
        return projectResources;
    }

    public void setProjectResources(List<ProjectResource> projectResources) {
        this.projectResources = projectResources;
    }

    public List<ResourceDetail> getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(List<ResourceDetail> resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                ", projectResources=" + projectResources +
                ", resourceDetails=" + resourceDetails +
                '}';
    }
}
