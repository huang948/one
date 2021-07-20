package com.sample.demo.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "project_resources")
public class ProjectResources {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recordId;


    @ManyToOne
    @JoinColumn(name = "project_id")
    private Project project;

    @ManyToOne
    @JoinColumn(name = "resourceId")
    private Resource resource;

    private Date time_created;

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
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

    public Date getTime_created() {
        return time_created;
    }

    public void setTime_created(Date time_created) {
        this.time_created = time_created;
    }

    @Override
    public String toString() {
        return "ProjectResources{" +
                "recordId=" + recordId +
                '}';
    }
}

