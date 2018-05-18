package com.telran.mishpahug.api;

import java.time.LocalDate;
import java.util.List;

public class EventData {
    private int id;
    private String title;
    private LocalDate eventDate;
    private LocalDate creationDate;
    private String city;
    private String owner;
    private String description;
    private String eventType;
    private String eventStatus;
    private List<String> following;
    private int PlaceId;
    private double latitude;
    private double longitude;

    public EventData(int id, String title, LocalDate eventDate, LocalDate creationDate, String city, String owner, String description, String eventType, String eventStatus, List<String> following, int placeId, double latitude, double longitude) {
        this.id = id;
        this.title = title;
        this.eventDate = eventDate;
        this.creationDate = creationDate;
        this.city = city;
        this.owner = owner;
        this.description = description;
        this.eventType = eventType;
        this.eventStatus = eventStatus;
        this.following = following;
        PlaceId = placeId;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public EventData() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public List<String> getFollowing() {
        return following;
    }

    public void setFollowing(List<String> following) {
        this.following = following;
    }

    public int getPlaceId() {
        return PlaceId;
    }

    public void setPlaceId(int placeId) {
        PlaceId = placeId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
