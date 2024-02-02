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
public class Pump {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("device_id")
	private Long deviceId;

	
	private Long pFR;
	private Long pFY;
	private Long pFB;
	private Long vRN;
	private Long vYN;
	private Long vBN;
	private Long vRY;
	private Long vYB;
	private Long vBR;

	private Long ir;
	private Long iy;
	private Long ib;
	private Long supplyCount;
	private Long spare;
	private Long pf;
	private Long kwh;
	private Long kw;
	private Long frequency;
	private Long temp;
	private Long humidity;

	@CreationTimestamp
	@Column(nullable = false, updatable = false)
	private Timestamp createdTimestamp;

	@UpdateTimestamp
	@Column(nullable = false)
	private Timestamp updatedTimestamp;

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public Long getpFR() {
		return pFR;
	}

	public void setpFR(Long pFR) {
		this.pFR = pFR;
	}

	public Long getpFY() {
		return pFY;
	}

	public void setpFY(Long pFY) {
		this.pFY = pFY;
	}

	public Long getpFB() {
		return pFB;
	}

	public void setpFB(Long pFB) {
		this.pFB = pFB;
	}

	public Long getvRN() {
		return vRN;
	}

	public void setvRN(Long vRN) {
		this.vRN = vRN;
	}

	public Long getvYN() {
		return vYN;
	}

	public void setvYN(Long vYN) {
		this.vYN = vYN;
	}

	public Long getvBN() {
		return vBN;
	}

	public void setvBN(Long vBN) {
		this.vBN = vBN;
	}

	public Long getvRY() {
		return vRY;
	}

	public void setvRY(Long vRY) {
		this.vRY = vRY;
	}

	public Long getvYB() {
		return vYB;
	}

	public void setvYB(Long vYB) {
		this.vYB = vYB;
	}

	public Long getvBR() {
		return vBR;
	}

	public void setvBR(Long vBR) {
		this.vBR = vBR;
	}

	public Long getIr() {
		return ir;
	}

	public void setIr(Long ir) {
		this.ir = ir;
	}

	public Long getIy() {
		return iy;
	}

	public void setIy(Long iy) {
		this.iy = iy;
	}

	public Long getIb() {
		return ib;
	}

	public void setIb(Long ib) {
		this.ib = ib;
	}

	public Long getSupplyCount() {
		return supplyCount;
	}

	public void setSupplyCount(Long supplyCount) {
		this.supplyCount = supplyCount;
	}

	public Long getSpare() {
		return spare;
	}

	public void setSpare(Long spare) {
		this.spare = spare;
	}

	public Long getPf() {
		return pf;
	}

	public void setPf(Long pf) {
		this.pf = pf;
	}

	public Long getKwh() {
		return kwh;
	}

	public void setKwh(Long kwh) {
		this.kwh = kwh;
	}

	public Long getKw() {
		return kw;
	}

	public void setKw(Long kw) {
		this.kw = kw;
	}

	public Long getFrequency() {
		return frequency;
	}

	public void setFrequency(Long frequency) {
		this.frequency = frequency;
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
