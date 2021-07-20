package com.sample.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "resources_detail")
public class ResourcesDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Integer recordId;

    @CreatedDate
    @Column(name = "time_created")
    private Date time_created;


    @LastModifiedDate
    @Column(name = "last_updated")
    private Date last_updated;



    @ManyToOne()
    @JoinColumn(name = "resources_id")
    @JsonIgnore
    private Resource resource;

    @ManyToOne()
    @JoinColumn(name = "column_id")
    private ProjectColumns projectColumns;

    private String column_value;

    public Integer getResources_code() {
        return resources_code;
    }

    public void setResources_code(Integer resources_code) {
        this.resources_code = resources_code;
    }

    @Column(name = "resources_code")
    private Integer resources_code;

    public ResourcesDetails() {
    }

    public ResourcesDetails(String column_value) {
        this.column_value = column_value;
    }

    public ResourcesDetails(Integer recordId, Resource resource, ProjectColumns projectColumns, String column_value, Integer resources_code) {
        this.recordId = recordId;
        this.resource = resource;
        this.projectColumns = projectColumns;
        this.column_value = column_value;
        this.resources_code = resources_code;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Date getTime_created() {
        return time_created;
    }

    public void setTime_created(Date time_created) {
        this.time_created = time_created;
    }

    public Date getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(Date last_updated) {
        this.last_updated = last_updated;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    public String getColumn_value() {
        return column_value;
    }

    public void setColumn_value(String column_value) {
        this.column_value = column_value;
    }

    public ProjectColumns getProjectColumns() {
        return projectColumns;
    }

    public void setProjectColumns(ProjectColumns projectColumns) {
        this.projectColumns = projectColumns;
    }



    @Override
    public String toString() {
        return "ResourcesDetails{" +
                "recordId=" + recordId +
                ", time_created=" + time_created +
                ", last_updated=" + last_updated +
                ", resource=" + resource +
                ", projectColumns=" + projectColumns +
                ", column_value='" + column_value + '\'' +
                '}';
    }
}
