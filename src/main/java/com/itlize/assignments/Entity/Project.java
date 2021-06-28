package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Project {

    @Id
    @GeneratedValue
    private Integer id;

    private LocalDateTime timeCreated;

    @ManyToOne
    private User owner;

}
