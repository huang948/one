package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer projectId;

    private LocalDateTime timeCreated;

    @ManyToOne
    private User owner;

    @OneToMany(mappedBy = "project", cascade = { CascadeType.REMOVE })
    private List<ProjectResource> projectResources;

    @OneToMany(mappedBy = "project", cascade = { CascadeType.REMOVE })
    private List<ProjectColumn> projectColumns;

    public Project() {

    }

    public Project(LocalDateTime timeCreated, User owner, List<ProjectResource> projectResources, List<ProjectColumn> projectColumns) {
        this.timeCreated = timeCreated;
        this.owner = owner;
        this.projectResources = projectResources;
        this.projectColumns = projectColumns;
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

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public List<ProjectResource> getProjectResources() {
        return projectResources;
    }

    public void setProjectResources(List<ProjectResource> projectResources) {
        this.projectResources = projectResources;
    }

    public List<ProjectColumn> getProjectColumns() {
        return projectColumns;
    }

    public void setProjectColumns(List<ProjectColumn> projectColumns) {
        this.projectColumns = projectColumns;
    }

    @Override
    public String toString() {
        return "Project{" +
                "projectId=" + projectId +
                ", timeCreated=" + timeCreated +
                ", owner=" + owner +
                ", projectResources=" + projectResources +
                ", projectColumns=" + projectColumns +
                '}';
    }
}
