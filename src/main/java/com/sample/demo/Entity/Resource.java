package com.sample.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "resources")
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "resource_id", updatable = false)
    private Integer resourceId;

    @CreatedDate
    @Column(name = "time_created", updatable = false)
    private Date time_created;


    @LastModifiedDate
    @Column(name = "last_updated")
    private Date last_updated;


    @OneToMany (mappedBy="resource",
            fetch = FetchType.EAGER,
            cascade=CascadeType.ALL)
    @JsonIgnore
    private Set<ProjectResources> projectResources = new HashSet<>();

    @OneToMany( mappedBy = "resource",
            fetch = FetchType.EAGER,
            cascade=CascadeType.ALL)
    private Set<ResourcesDetails> resourcesDetails;

    public Set<ResourcesDetails> getResourcesDetails() {
        return resourcesDetails;
    }

    public void setResourcesDetails(Set<ResourcesDetails> resourcesDetails) {
        this.resourcesDetails = resourcesDetails;
    }

    public void addProjects(ProjectResources project){
        if (projectResources.contains(project)) return;
        projectResources.add(project);
        project.setResource(this);
    }

    public Resource() {
    }

    public Resource(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public Integer getResource_id() {
        return resourceId;
    }

    public Date getTime_created() {
        return time_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setResource_id(Integer resourceId) {
        this.resourceId = resourceId;
    }

    public void setTime_created(Date time_created) {
        this.time_created = time_created;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public Set<ProjectResources> getProjectResources() {
        return projectResources;
    }

    public void setProjectResources(Set<ProjectResources> projectResources) {
        this.projectResources = projectResources;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "resourceId=" + resourceId +
                ", time_created=" + time_created +
                ", last_updated=" + last_updated +
                ", projectResources=" + projectResources +
                ", resourcesDetails=" + resourcesDetails +
                '}';
    }
}
