package com.autocruis.ordersystem.entity;

/**
 * @author Ziming Shen
 * @create 2022-06-27 17:28
 */
public class Customer {

    private String email;
    private String firstName;
    private String lastName;
    private String password;
    private boolean enabled;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return  enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

