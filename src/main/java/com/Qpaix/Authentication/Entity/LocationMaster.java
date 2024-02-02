package com.Qpaix.Authentication.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Location_master")
@Data
public class LocationMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("location_id")
	private Long LocId;
	@JsonProperty("location_name")
	private String LocName;
	@JsonProperty("location_type")
	private String LocType;
	@JsonProperty("area")
	private Long area;
	@JsonProperty("longitude")
	private float longitude;
	@JsonProperty
	private float latitude;
	public Long getLocId() {
		return LocId;
	}
	public void setLocId(Long locId) {
		LocId = locId;
	}
	public String getLocName() {
		return LocName;
	}
	public void setLocName(String locName) {
		LocName = locName;
	}
	public String getLocType() {
		return LocType;
	}
	public void setLocType(String locType) {
		LocType = locType;
	}
	public Long getArea() {
		return area;
	}
	public void setArea(Long area) {
		this.area = area;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public LocationMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
