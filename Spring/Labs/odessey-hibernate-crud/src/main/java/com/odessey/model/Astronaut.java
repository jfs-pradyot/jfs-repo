package com.odessey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Astronaut {
	@Id
	private String astronautId;
	@Column
	private String astronautName;
	@Column
	private String astronautGender;
	@Column
	private String astronautCountry;
	
	
	public String getAstronautId() {
		return astronautId;
	}
	public void setAstronautId(String astronautId) {
		this.astronautId = astronautId;
	}
	@Override
	public String toString() {
		return "Astronaut [astronautId=" + astronautId + ", astronautName=" + astronautName + ", astronautGender="
				+ astronautGender + ", astronautCountry=" + astronautCountry + "]";
	}
	public String getAstronautName() {
		return astronautName;
	}
	public void setAstronautName(String astronautName) {
		this.astronautName = astronautName;
	}
	public String getAstronautGender() {
		return astronautGender;
	}
	public void setAstronautGender(String astronautGender) {
		this.astronautGender = astronautGender;
	}
	public String getAstronautCountry() {
		return astronautCountry;
	}
	public void setAstronautCountry(String astronautCountry) {
		this.astronautCountry = astronautCountry;
	}
	
	
}
