package com.itlize.assignments.Entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    @Column(unique=true)
    private String username;
    private String title;
    private String role;

    private LocalDateTime timeCreated;
    private LocalDateTime lastUpdated;

    private String password;

    @ManyToOne
    private Project project;


    public User(String username, String title, String role, LocalDateTime timeCreated, LocalDateTime lastUpdated, String password, Project project) {
        this.username = username;
        this.title = title;
        this.role = role;
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.password = password;
        this.project = project;
    }

    public User() {

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDateTime getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDateTime timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", title='" + title + '\'' +
                ", role='" + role + '\'' +
                ", timeCreated=" + timeCreated +
                ", lastUpdated=" + lastUpdated +
                ", password='" + password + '\'' +
                ", project=" + project +
                '}';
    }
}
