package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class ProjectResource {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;

    @OneToMany(mappedBy="projectResource")
    private List<Project> projects = new ArrayList<>();

    @OneToMany(mappedBy = "projectResource")
    private List<Resource> resources = new ArrayList<>();

    public ProjectResource() {

    }

    public ProjectResource(LocalDateTime timeCreated, List<Project> projects, List<Resource> resources) {
        this.timeCreated = timeCreated;
        this.projects = projects;
        this.resources = resources;
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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    @Override
    public String toString() {
        return "ProjectResource{" +
                "recordId=" + recordId +
                ", timeCreated=" + timeCreated +
                ", projects=" + projects +
                ", resources=" + resources +
                '}';
    }
}
