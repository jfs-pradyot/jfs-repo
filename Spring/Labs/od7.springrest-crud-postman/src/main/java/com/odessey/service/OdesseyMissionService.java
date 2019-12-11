package com.odessey.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

import com.odessey.repository.OdesseyRepositoryAstronaut;
import com.odessey.repository.OdesseyRepositoryMission;

@Service("odesseymissionservice")
public class OdesseyMissionService implements OdesseyService {
	@Autowired
	private OdesseyRepositoryMission odesseyRepositorymission;
	
	public void saveMissionDetails(Mission missionDetails) {
		 odesseyRepositorymission.save(missionDetails);
		
	}
	@Override
	public List<Mission> getMissionDetails(){
		return odesseyRepositorymission.findAll();
	}


	
	



	@Override
	public void updateMissionDetails(Mission missionDetails) {
		 odesseyRepositorymission.save(missionDetails);
		
	}

	@Override
	public List<Astronaut> getAstronautDetails() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updateAstronautDetails(Astronaut astronautDetails) {
		
		
	}
	@Override
	public void saveAstronautDetails(Astronaut astronautDetails) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
