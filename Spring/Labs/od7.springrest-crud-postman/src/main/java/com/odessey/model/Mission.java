package com.odessey.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Mission {
	@Id
	@Column(name="missionid")
	private String missionID;
	@Column(name="missionname")
	private String missionName;
	@Column(name="spacecraft")
	private String spaceCraft;
	@Column(name="agency")
	private String agency;
	@Column(name="status")
	private String status;
	
	
	public String getMissionID() {
		return missionID;
	}
	public void setMissionID(String missionID) {
		this.missionID = missionID;
	}
	public String getMissionName() {
		return missionName;
	}
	public void setMissionName(String missionName) {
		this.missionName = missionName;
	}
	public String getSpaceCraft() {
		return spaceCraft;
	}
	public void setSpaceCraft(String spaceCraft) {
		this.spaceCraft = spaceCraft;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Mission [missionID=" + missionID + ", spaceCraft=" + spaceCraft + ", agency=" + agency + ", status="
				+ status + "]";
	}

}
