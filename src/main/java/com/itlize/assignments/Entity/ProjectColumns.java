package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

enum Type {
    NUMBER, TEXT, FORMULA
}

@Entity
public class ProjectColumns {

    @Id
    @GeneratedValue
    private Integer columnId;

    // foreign key to project (1 to many)

    private String columnName;
    private Type type;
    private String formulaText;
}
