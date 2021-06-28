package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ResourcesDetails {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    // foreign key to resources (1 to many)

    private String columnValue;

    // foreign key to project columns (1 to many)


}
