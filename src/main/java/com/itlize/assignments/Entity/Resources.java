package com.itlize.assignments.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Resources {

    @Id
    @GeneratedValue
    private Integer resourceId;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

}
