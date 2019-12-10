package com.odessey.repository;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.cfg.CreateKeySecondPass;
import org.springframework.stereotype.Repository;

import com.odessey.util.*;
import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
@Repository("odesseyrepositoryoracle")
public class OdesseyRepositoryOracle implements OdesseyRepository {
	
	@SuppressWarnings("unchecked")
	public List<Mission> fetchMissionDetails(){
		List<Mission> missionDetailList=new ArrayList<Mission>();
		Mission mission=new Mission();
		mission.setMissionID("IM04");
		mission.setMissionName("MissionMars");
		mission.setSpaceCraft("MarsRover");
		mission.setStatus("Successful");
		mission.setAgency("NASA");
//		missionDetailList.add(missionChandrayan);
		
		Session session=OdesseyUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(mission);
		
		
		session.getTransaction().commit();
		session.close();
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
