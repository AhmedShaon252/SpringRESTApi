package com.springRESTApi.springRestApi.todoRestApi;

import java.util.Date;

public class Todo {
    private long id;
    private String username;
    private String description;
    private Date targetdate;
    private boolean isDone;

    public Todo(long id, String username, String description, Date targetdate, boolean isDone) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetdate = targetdate;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetdate() {
        return targetdate;
    }

    public void setTargetdate(Date targetdate) {
        this.targetdate = targetdate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

}
