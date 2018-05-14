package com.telran.mishpahug.api;

import java.time.LocalDate;

public class UserEditDTO {

    private String fullName;
    private String type;
    private boolean sex;
    private LocalDate birthday;
    private String photo;
    private String address;
    private String kitchen;
    private String religion;
    private boolean kosher;
    private boolean maritalStatus;
    private String language;
    private String about;
    private String allergy;

    public UserEditDTO(String fullName, String type, boolean sex, LocalDate birthday, String photo, String address, String kitchen, String religion, boolean kosher, boolean maritalStatus, String language, String about, String allergy) {
        this.fullName = fullName;
        this.type = type;
        this.sex = sex;
        this.birthday = birthday;
        this.photo = photo;
        this.address = address;
        this.kitchen = kitchen;
        this.religion = religion;
        this.kosher = kosher;
        this.maritalStatus = maritalStatus;
        this.language = language;
        this.about = about;
        this.allergy = allergy;
    }

    public UserEditDTO() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getKitchen() {
        return kitchen;
    }

    public void setKitchen(String kitchen) {
        this.kitchen = kitchen;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isKosher() {
        return kosher;
    }

    public void setKosher(boolean kosher) {
        this.kosher = kosher;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
}
