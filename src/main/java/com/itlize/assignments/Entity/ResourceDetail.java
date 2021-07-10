package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class ResourceDetail {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    @ManyToOne
    private Resource resource;

    private String newValue;

    @ManyToOne
    private ProjectColumn projectColumn;

    public ResourceDetail() {

    }

    public ResourceDetail(LocalDateTime timeCreated, LocalDateTime lastUpdated, Resource resource, String newValue, ProjectColumn projectColumn) {
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.resource = resource;
        this.newValue = newValue;
        this.projectColumn = projectColumn;
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

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public ProjectColumn getProjectColumn() {
        return projectColumn;
    }

    public void setProjectColumn(ProjectColumn projectColumn) {
        this.projectColumn = projectColumn;
    }

    @Override
    public String toString() {
        return "ResourceDetail{" +
                "recordId=" + recordId +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                ", resource=" + resource +
                ", newValue=" + newValue +
                ", projectColumn=" + projectColumn +
                '}';
    }
}
