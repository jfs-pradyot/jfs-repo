package com.odessey.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
@Repository("odesseyrepositoryoracle")
public class OdesseyRepositoryOracle implements OdesseyRepository {
	
	public List<Mission> fetchMissionDetails(){
		List<Mission> missionDetailList=new ArrayList<Mission>();
		Mission missionChandrayan=new Mission();
		missionChandrayan.setMissionID("IM08");
		missionChandrayan.setMissionName("Chandrayan");
		missionChandrayan.setSpaceCraft("Chandrayan-1");
		missionChandrayan.setStatus("Successful");
		missionChandrayan.setAgency("ISRO");
		missionDetailList.add(missionChandrayan);
		return missionDetailList;
		
	}
	
	
	public List<Astronaut> fetchAstronautDetails(){
		List<Astronaut> astronautDetailList=new ArrayList<Astronaut>();
		Astronaut missionChandrayan=new Astronaut();
		missionChandrayan.setAstronautId("A05");
		missionChandrayan.setAstronautName("Rakesh");
		missionChandrayan.setAstronautGender("Male");
		missionChandrayan.setAstronautCountry("India");
		
		astronautDetailList.add(missionChandrayan);
		return astronautDetailList;
		
	}

}
