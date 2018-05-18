package com.telran.mishpahug.api;

public class UserRemoveDTO {
    private String email;
    private int eventId;

    public UserRemoveDTO(String email, int eventId) {
        this.email = email;
        this.eventId = eventId;
    }

    public UserRemoveDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }
}
