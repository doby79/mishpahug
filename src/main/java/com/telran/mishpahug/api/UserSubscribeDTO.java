package com.telran.mishpahug.api;

public class UserSubscribeDTO {
    private String email;
    private int eventid;

    public UserSubscribeDTO(String email, int eventid) {
        this.email = email;
        this.eventid = eventid;
    }

    public UserSubscribeDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEventid() {
        return eventid;
    }

    public void setEventid(int eventid) {
        this.eventid = eventid;
    }
}