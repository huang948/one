package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.util.ArrayList;
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

    @OneToMany(mappedBy = "projectColumn")
    private List<Project> projectIds = new ArrayList<>();

    @ManyToOne
    private ResourceDetail resourceDetail;

    private String columnName;
    private Type type;
    private String formulaText;

    public ProjectColumn() {

    }

    public ProjectColumn(List<Project> projectIds, ResourceDetail resourceDetail, String columnName, Type type, String formulaText) {
        this.projectIds = projectIds;
        this.resourceDetail = resourceDetail;
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

    public List<Project> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<Project> projectIds) {
        this.projectIds = projectIds;
    }

    public ResourceDetail getResourceDetail() {
        return resourceDetail;
    }

    public void setResourceDetail(ResourceDetail resourceDetail) {
        this.resourceDetail = resourceDetail;
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
                ", projectIds=" + projectIds +
                ", resourceDetail=" + resourceDetail +
                ", columnName='" + columnName + '\'' +
                ", type=" + type +
                ", formulaText='" + formulaText + '\'' +
                '}';
    }
}
