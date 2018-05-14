package com.telran.mishpahug.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name="users")
public class User {
	@Id
	private String email;
	private String fullname;
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
	private int rateCount;
	private int rate;
	private boolean available;
	private String token;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "user_event")
	private List<Event> events;
	private Map<Integer,Place> confirmedEvents;

	public boolean isSex() {
		return sex;
	}

	public boolean isMaritalStatus() {
		return maritalStatus;
	}

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

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
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

	public boolean getSex() {
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

	public boolean getMaritalStatus() {
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

	public int getRateCount() {
		return rateCount;
	}

	public void setRateCount(int rateCount) {
		this.rateCount = rateCount;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public boolean isValiable() {
		return available;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void setValiable(boolean valiable) {
		this.available = valiable;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}
	public User(){}
	public User(String email, String fullName, String role, boolean type, String phone, boolean sex, String birthday, String photo, String address, boolean marStatus, String kitchen, String religion, boolean kosher, String language, String about, String allergy, int rate, int rateCount, boolean available, Set<Event> events) {

	}

}
