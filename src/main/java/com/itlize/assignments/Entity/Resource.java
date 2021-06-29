package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class Resource {

    @Id
    @GeneratedValue
    private Integer resourceId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    @ManyToOne
    private ProjectResource projectResource;

    @ManyToOne
    private ResourceDetail resourceDetail;

    public Resource() {

    }

    public Resource(LocalDateTime timeCreated, LocalDateTime lastUpdated, ProjectResource projectResource, ResourceDetail resourceDetail) {
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.projectResource = projectResource;
        this.resourceDetail = resourceDetail;
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

    public ProjectResource getProjectResource() {
        return projectResource;
    }

    public void setProjectResource(ProjectResource projectResource) {
        this.projectResource = projectResource;
    }

    public ResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(ResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                ", projectResource=" + projectResource +
                ", resourceDetail=" + resourceDetail +
                '}';
    }
}
