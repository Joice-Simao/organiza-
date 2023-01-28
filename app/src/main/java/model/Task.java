package model;

import java.util.Date;

public class Task {
        
    private int id;
    private int idProject;    
    private String name;
    private String description;
    private boolean completed;
    private String notes;
    private Date deadline;
    private Date createdAt;
    private Date updateAt;
    
    public Task(){
        this.completed = false;
        this.createdAt = new Date();
        this.updateAt = new Date();        
    }

    public Task(int id, String name, String description, boolean isCompleted, String notes, Date deadline, Date createdAt, Date updateAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = isCompleted;
        this.notes = notes;
        this.deadline = deadline;
        this.createdAt = createdAt;
        this.updateAt = updateAt;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
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

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
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

}