package com.telran.mishpahug.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="events")
public class Event {
	@Id
	@SequenceGenerator(name = "idSeq", initialValue = 1, allocationSize = 1, sequenceName = "EVENT_SEQUENCE")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeq")
	private int id;
	private String title;
	private LocalDate eventDate;
	private LocalDate creationDate;
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private Place place;
	private String owner;
	private String description;
	private String eventType;
	private String eventStatus;
	@ManyToMany(mappedBy="events",fetch=FetchType.EAGER)
	List<String>following;
	public Event(String title) {
		super();
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getFollowing() {
		return following;
	}
	public void setFollowing(List<String> following) {
		this.following = following;
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
	public Place getPlace() {
		return place;
	}
	public void setPlace(Place place) {
		this.place = place;
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

	public Event() {
	}

	public Event(int id, String title, LocalDate eventDate, LocalDate creationDate, Place place, String owner, String description, String eventType, String eventStatus, List<String> following) {
		this.id = id;
		this.title = title;
		this.eventDate = eventDate;
		this.creationDate = creationDate;
		this.place = place;
		this.owner = owner;
		this.description = description;
		this.eventType = eventType;
		this.eventStatus = eventStatus;
		this.following = following;
	}
}
