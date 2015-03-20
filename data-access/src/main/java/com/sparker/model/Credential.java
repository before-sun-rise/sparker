package com.sparker.model;

/**
 * @author Mehdi Afsari Kashi
 * @version 1.0.0
 *          <p/>
 *          Creation Date: 2015/03/20
 * @since 1.0.0
 */
public class Credential {

    String username;
    String password;


    public Credential(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Credential() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
