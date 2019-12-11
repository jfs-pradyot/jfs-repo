package com.odessey.service;

import java.util.List;

import javax.sound.sampled.AudioInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;

import com.odessey.repository.OdesseyRepositoryAstronaut;
@Service("odesseyastronautservice")
public class OdesseyAstronautService implements OdesseyService {
	
	@Autowired
	private OdesseyRepositoryAstronaut odesseyRepositoryAstronaut;
	
	@Override
	public void saveAstronautDetails(Astronaut astronautDetails) {
		odesseyRepositoryAstronaut.save(astronautDetails);
	}
	
	public List<Astronaut> getAstronautDetails(){
		return odesseyRepositoryAstronaut.findAll();
	}

	
	@Override
	public void updateAstronautDetails(Astronaut astronautDetails) {
		odesseyRepositoryAstronaut.save(astronautDetails);
		
	}
	
	
	
	@Override
	public void saveMissionDetails(Mission missionDetails) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public List<Mission> getMissionDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public void updateMissionDetails(Mission missionDetails) {
		// TODO Auto-generated method stub
		
	}


	

	

}
