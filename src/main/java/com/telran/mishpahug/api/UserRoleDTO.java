package com.telran.mishpahug.api;

public class UserRoleDTO {

    private String email;
    private String role;

    public UserRoleDTO(String email, String role) {
        this.email = email;
        this.role = role;
    }

    public UserRoleDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
