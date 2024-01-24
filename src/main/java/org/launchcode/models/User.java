package org.launchcode.models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class User {
    @NotEmpty(message="Please enter Username")
    @Size(min=5, max=15, message="Username must be 5 to 15 charaters")
    private String username;
    @Email(message="Invaild email")
    private String email;
    @NotEmpty(message="Please enter Password")
    @Size(max=6, message="Password can have upto 6 charaters")
    private String password;

    public User() {
    }
    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

