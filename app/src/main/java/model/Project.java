package model;

import java.util.Date;
import java.util.List;

public class Project {
    
    private int id;
    private String name;
    private String description;
    private List<Task> tasks;
    private Date createdAt;
    private Date updateAt;

    public Project(int id, String name, String description, List<Task> tasks, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tasks = tasks;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }    
    
    public Project() {
        this.createdAt = new Date();
        this.updateAt = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }   

    @Override
    public String toString() {
        return this.name;
    }   
}