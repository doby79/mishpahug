package com.telran.mishpahug.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="places")
public class Place implements Serializable {
	@Id
//	@SequenceGenerator(name = "idSeq", initialValue = 1, allocationSize = 1, sequenceName = "EVENT_SEQUENCE")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idSeq")
	private int PlaceId;
	private double latitude;
	private double longitude;
	private String city;
	public Place(int placeId, double latitude, double longitude, String city) {
		super();
		PlaceId = placeId;
		this.latitude = latitude;
		this.longitude = longitude;
		this.city = city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Place() {

	}

}
