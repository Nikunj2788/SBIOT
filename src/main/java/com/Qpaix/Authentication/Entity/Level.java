package com.Qpaix.Authentication.Entity;

import java.sql.Timestamp;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Level {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("device_id")
	private Long DeviceId;
	@JsonProperty("levelcount")
	private Long levelcount;
	@JsonProperty("nrbvoltage")
	private Long nrbvoltage;
	@JsonProperty("rbvvoltage")
	private Long rbvoltage;
	@JsonProperty("temp")
	private float temp;
	@JsonProperty("humidity")
	private float humidity;

	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private Timestamp createdTimestamp;

	@UpdateTimestamp
	@Column(nullable = false)
	private Timestamp updatedTimestamp;

	public Long getDeviceId() {
		return DeviceId;
	}

	public void setDeviceId(Long deviceId) {
		DeviceId = deviceId;
	}

	public Long getLevelcount() {
		return levelcount;
	}

	public void setLevelcount(Long levelcount) {
		this.levelcount = levelcount;
	}

	public Long getNrbvoltage() {
		return nrbvoltage;
	}

	public void setNrbvoltage(Long nrbvoltage) {
		this.nrbvoltage = nrbvoltage;
	}

	public Long getRbvoltage() {
		return rbvoltage;
	}

	public void setRbvoltage(Long rbvoltage) {
		this.rbvoltage = rbvoltage;
	}

	public float getTemp() {
		return temp;
	}

	public void setTemp(float temp) {
		this.temp = temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public Timestamp getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Timestamp createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Timestamp getUpdatedTimestamp() {
		return updatedTimestamp;
	}

	public void setUpdatedTimestamp(Timestamp updatedTimestamp) {
		this.updatedTimestamp = updatedTimestamp;
	}

	public Level() {
		super();
		// TODO Auto-generated constructor stub
	}

}
