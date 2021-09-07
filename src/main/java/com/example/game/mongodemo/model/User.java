package com.example.game.mongodemo.model;

import com.mongodb.DBObject;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {
    private static final long serialVersionUID = -3258839839160856613L;
    private Long id;
    private String userName;
    private String passWord;

    /**
     * task
     */
    private List<DBObject> tasks;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<DBObject> getTasks() {
        return tasks;
    }

    public void setTasks(List<DBObject> tasks) {
        this.tasks = tasks;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

