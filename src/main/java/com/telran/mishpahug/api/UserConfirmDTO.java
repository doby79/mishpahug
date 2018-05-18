package com.telran.mishpahug.api;

public class UserConfirmDTO {
    private String email;
    private int id;

    public UserConfirmDTO(String email, int id) {
        this.email = email;
        this.id = id;
    }

    public UserConfirmDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
