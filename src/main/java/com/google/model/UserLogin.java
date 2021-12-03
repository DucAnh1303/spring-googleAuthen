package com.google.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserLogin {
    @Id
    private int id;
    private String username;
    private String email;
    private String provide;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProvide() {
        return provide;
    }

    public void setProvide(String provide) {
        this.provide = provide;
    }
}
