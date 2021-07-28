package com.itlize.assignments.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ProjectResource {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;

//    @ManyToOne(cascade = { CascadeType.DETACH })
    @ManyToOne
    private Project project;

//    @ManyToOne(cascade = { CascadeType.DETACH })
    @ManyToOne
    private Resource resource;

    public ProjectResource() {

    }

    public ProjectResource(LocalDateTime timeCreated, Project project, Resource resource) {
        this.timeCreated = timeCreated;
        this.project = project;
        this.resource = resource;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return "ProjectResource{" +
                "recordId=" + recordId +
                ", timeCreated=" + timeCreated +
                ", project=" + project +
                ", resource=" + resource +
                '}';
    }
}
