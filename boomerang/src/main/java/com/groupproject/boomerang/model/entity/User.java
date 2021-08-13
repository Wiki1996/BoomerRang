package com.groupproject.boomerang.model.entity;

// Entity  if need Hibernate framework

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * to do:
 * 1. password need md5 hash (copy from Twitch)
 * ( 2. may need hibernate)

 */
@Entity
@Table(name ="users")
public class User {

    private static final long serialVersionUID = 2681531852204068105L; // 这东西是 uuid

    @Id
    private long id;
    private String password;  // need
    private String userName ;
    private boolean enabled;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
