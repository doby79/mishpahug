package com.telran.mishpahug.api;

public class UserBlockDTO {
    private String email;
    private boolean blockStatus;

    public UserBlockDTO(String email, boolean blockStatus) {
        this.email = email;
        this.blockStatus = blockStatus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(boolean blockStatus) {
        this.blockStatus = blockStatus;
    }
}
