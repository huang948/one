package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer projectId;

    private LocalDateTime timeCreated;

    @OneToMany(mappedBy="project")
    private List<User> owners = new ArrayList<User>();

    @ManyToOne
    private ProjectResource projectResource;

    @ManyToOne
    private ProjectColumn projectColumn;

    public Project(LocalDateTime timeCreated, List<User> owners) {
        this.timeCreated = timeCreated;
        this.owners = owners;
    }

    public Project() {

    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public List<User> getOwners() {
        return owners;
    }

    public void setOwners(List<User> owners) {
        this.owners = owners;
    }

    public ProjectResource getProjectResource() {
        return projectResource;
    }

    public void setProjectResource(ProjectResource projectResource) {
        this.projectResource = projectResource;
    }

    public ProjectColumn getProjectColumn() {
        return projectColumn;
    }

    public void setProjectColumn(ProjectColumn projectColumn) {
        this.projectColumn = projectColumn;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", timeCreated=" + timeCreated +
                ", owners=" + owners +
                ", projectResource=" + projectResource +
                ", projectColumn=" + projectColumn +
                '}';
    }
}
