package ru.vtb.internship.jackson.entity;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.List;

public class Member {
    private long id;
    private String name;
    private List<Task> tasks;

    public Member() {
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
