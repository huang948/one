package com.sample.demo.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "user")
public class User {

    @Id
    @Column(name = "userName",unique = true)
    private String userName;

    private String password;

    @Enumerated(value = EnumType.STRING)
    private Role role;


    @CreatedDate
    @Column(name = "time_created")
    private Date timeCreated;


    @LastModifiedDate
    @Column(name = "last_updated")
    private Date lastUpdated;




    @OneToMany(targetEntity = Project.class,cascade = CascadeType.REMOVE,mappedBy = "owner")
    @LazyCollection(LazyCollectionOption.FALSE)
    @JsonIgnore
    private Set<Project> projects;


    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }

    public void addProject(Project newProject){
        if(projects.contains(newProject)){
            return;
        }
        projects.add(newProject);
        newProject.setOwner(this);

    }


    public User() {}


    public User(String userName, Role role, String password) {
        this.userName = userName;
        this.role = role;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }


    public Role getRole() {
        return role;
    }


    public String getPassword() {
        return password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public Date getTime_created() {
        return timeCreated;
    }

    public Date getLast_updated() {
        return lastUpdated;
    }




    public void setPassword(String password) {
        this.password = password;
    }


    public void setTime_created(Date time_created) {
        this.timeCreated = time_created;
    }

    public void setLast_updated(Date last_updated) {
        this.lastUpdated = last_updated;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" +
                ", user_name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", time_created=" + timeCreated +
                ", last_updated=" + lastUpdated +
                '}';
    }
}