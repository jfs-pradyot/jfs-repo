package com.odessey.service;

import java.util.List;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

public interface OdesseyService {
	public void saveMissionDetails(Mission missionDetails);
	public List<Mission> getMissionDetails();
	public void updateMissionDetails(Mission missionDetails);
	
	
	public void saveAstronautDetails(Astronaut astronautDetails);
	public List<Astronaut> getAstronautDetails();
	public void updateAstronautDetails(Astronaut astronautDetails);

}
