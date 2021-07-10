package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class ProjectColumn {

    public enum Type {
        NUMBER,
        TEXT,
        FORMULA
    }

    @Id
    @GeneratedValue
    private Integer columnId;

    @ManyToOne
    private Project project;

    @OneToMany(mappedBy = "projectColumn")
    private List<ResourceDetail> resourceDetails;

    private String columnName;
    private Type type;
    private String formulaText;

    public ProjectColumn() {

    }

    public ProjectColumn(Project project, List<ResourceDetail> resourceDetails, String columnName, Type type, String formulaText) {
        this.project = project;
        this.resourceDetails = resourceDetails;
        this.columnName = columnName;
        this.type = type;
        this.formulaText = formulaText;
    }

    public Integer getColumnId() {
        return columnId;
    }

    public void setColumnId(Integer columnId) {
        this.columnId = columnId;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public List<ResourceDetail> getResourceDetails() {
        return resourceDetails;
    }

    public void setResourceDetails(List<ResourceDetail> resourceDetails) {
        this.resourceDetails = resourceDetails;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getFormulaText() {
        return formulaText;
    }

    public void setFormulaText(String formulaText) {
        this.formulaText = formulaText;
    }

    @Override
    public String toString() {
        return "ProjectColumn{" +
                "columnId=" + columnId +
                ", project=" + project +
                ", resourceDetails=" + resourceDetails +
                ", columnName='" + columnName + '\'' +
                ", type=" + type +
                ", formulaText='" + formulaText + '\'' +
                '}';
    }
}
