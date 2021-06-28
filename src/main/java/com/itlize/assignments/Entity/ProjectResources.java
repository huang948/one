package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class ProjectResources {

    @Id
    @GeneratedValue
    private Integer recordId;

    private LocalDateTime timeCreated;

    // foreign key to project (1 to many)
    // foreign key to resources (1 to many)
}
