package com.itlize.assignments.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@DynamicUpdate
public class User {

    @Id
    @GeneratedValue
    private Integer userId;

    @Column(unique=true)
    private String username;
    private String title;
    private String role;

    @CreationTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate timeCreated;
    @UpdateTimestamp
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate lastUpdated;

    private String password;

    @OneToMany(mappedBy = "owner")
    private List<Project> projects;

    public User() {

    }

    public User(String username, String title, String role, LocalDate timeCreated, LocalDate lastUpdated, String password, List<Project> projects) {
        this.username = username;
        this.title = title;
        this.role = role;
        this.timeCreated = timeCreated;
        this.lastUpdated = lastUpdated;
        this.password = password;
        this.projects = projects;
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

    public LocalDate getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(LocalDate timeCreated) {
        this.timeCreated = timeCreated;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
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
                ", projects=" + projects +
                '}';
    }
}
