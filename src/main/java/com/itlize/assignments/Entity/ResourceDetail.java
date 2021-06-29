package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class ResourceDetail {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    @OneToMany(mappedBy = "resourceDetail")
    private List<Resource> resources;

    private Integer newValue;

    @OneToMany(mappedBy = "resourceDetail")
    private List<ProjectColumn> projectColumns;

    public ResourceDetail() {

    }

    public ResourceDetail(LocalDateTime timeCreated, LocalDateTime lastUpdated, List<Resource> resources, Integer newValue, List<ProjectColumn> projectColumns) {
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.resources = resources;
        this.newValue = newValue;
        this.projectColumns = projectColumns;
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

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Integer getNewValue() {
        return newValue;
    }

    public void setNewValue(Integer newValue) {
        this.newValue = newValue;
    }

    public List<ProjectColumn> getProjectColumns() {
        return projectColumns;
    }

    public void setProjectColumns(List<ProjectColumn> projectColumns) {
        this.projectColumns = projectColumns;
    }

    @Override
    public String toString() {
        return "ResourceDetail{" +
                "recordId=" + recordId +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                ", resources=" + resources +
                ", newValue=" + newValue +
                ", projectColumns=" + projectColumns +
                '}';
    }
}
