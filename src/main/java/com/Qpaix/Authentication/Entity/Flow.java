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
public class Flow {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("device_id")
	private Long DeviceId;
	@JsonProperty("spare")
	private Long spare;
	@JsonProperty("flowcount")
	private Long flowcount;
	@JsonProperty("nrbvoltage")
	private Long nrbvoltage;
	@JsonProperty("nc")
	private Long nc;
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

	public Long getSpare() {
		return spare;
	}

	public void setSpare(Long spare) {
		this.spare = spare;
	}

	public Long getFlowcount() {
		return flowcount;
	}

	public void setFlowcount(Long flowcount) {
		this.flowcount = flowcount;
	}

	public Long getNrbvoltage() {
		return nrbvoltage;
	}

	public void setNrbvoltage(Long nrbvoltage) {
		this.nrbvoltage = nrbvoltage;
	}

	public Long getNc() {
		return nc;
	}

	public void setNc(Long nc) {
		this.nc = nc;
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

}
