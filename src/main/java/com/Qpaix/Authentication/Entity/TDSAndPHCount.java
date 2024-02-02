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
public class TDSAndPHCount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("device_id")
	private Long DeviceId;
	private Long spare;
	private Long TDSCount;
	private Long PHCount;
	private Long NC;
	private Long temp;
	private Long humidity;
	
	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private Timestamp createdTimestamp;

	@UpdateTimestamp
	@Column(nullable = false)
	private Timestamp updatedTimestamp;

	public long getDeviceId() {
		return DeviceId;
	}

	public void setDeviceId(long deviceId) {
		DeviceId = deviceId;
	}


	public Long getSpare() {
		return spare;
	}

	public void setSpare(Long spare) {
		this.spare = spare;
	}

	public Long getTDSCount() {
		return TDSCount;
	}

	public void setTDSCount(Long tDSCount) {
		TDSCount = tDSCount;
	}

	public Long getPHCount() {
		return PHCount;
	}

	public void setPHCount(Long pHCount) {
		PHCount = pHCount;
	}

	public Long getNC() {
		return NC;
	}

	public void setNC(Long nC) {
		NC = nC;
	}

	public Long getTemp() {
		return temp;
	}

	public void setTemp(Long temp) {
		this.temp = temp;
	}

	public Long getHumidity() {
		return humidity;
	}

	public void setHumidity(Long humidity) {
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
