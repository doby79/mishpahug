package com.telran.mishpahug.api;

import com.telran.mishpahug.model.Place;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class UserData {
    private String email;
    private String fullName;
    private String role;
    private String type;
    private String phone;
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
    private int rate;
    private int rateCount;
    private boolean available;
    private List<String> eventsTitles;
    private Map<Integer,Place> confirmedEvents;

    public Map<Integer, Place> getConfirmedEvents() {
        return confirmedEvents;
    }

    public void setConfirmedEvents(Map<Integer, Place> confirmedEvents) {
        this.confirmedEvents = confirmedEvents;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRateCount() {
        return rateCount;
    }

    public void setRateCount(int rateCount) {
        this.rateCount = rateCount;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public List<String> getEventsTitles() {
        return eventsTitles;
    }

    public void setEventsTitles(List<String> eventsTitles) {
        this.eventsTitles = eventsTitles;
    }

    public UserData(String email, String fullName, String role, String type, String phone, boolean sex, LocalDate birthday, String photo, String address, String kitchen, String religion, boolean kosher, boolean maritalStatus, String language, String about, String allergy, int rate, int rateCount, boolean available, List<String> eventsTitles) {
        this.email = email;
        this.fullName = fullName;
        this.role = role;
        this.type = type;
        this.phone = phone;
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
        this.rate = rate;
        this.rateCount = rateCount;
        this.available = available;
        this.eventsTitles = eventsTitles;
    }

    public UserData(String email, String fullname, String role, String type, String phone, boolean sex, LocalDate birthday, String photo, String address, boolean maritalStatus, String kitchen, String religion, boolean kosher, String language, String about, String allergy, int rate, boolean available) {}

}