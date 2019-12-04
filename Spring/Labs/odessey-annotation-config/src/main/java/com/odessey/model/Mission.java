package com.odessey.model;

public class Mission {
	private String missionID;
	private String missionName;
	private String spaceCraft;
	private String agency;
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
