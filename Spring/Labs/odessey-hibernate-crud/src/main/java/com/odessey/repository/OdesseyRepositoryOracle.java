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
	public List<Mission> fetchMissionDetails() {
		 
		
		Session session=OdesseyUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query=session.createQuery("from Mission");
		List<Mission> missionDetailList=query.list();

		session.getTransaction().commit();
		session.close();
		return missionDetailList;

	}

	public List<Astronaut> fetchAstronautDetails() {
		Session session=OdesseyUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Astronaut> astronautDetailList= session.createQuery("from Astronaut").list();
		session.getTransaction().commit();
		session.close();
		
		return  astronautDetailList;
		
	}

	public void updateMissionDetails(Mission missionDetails) {
		Session session = OdesseyUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(missionDetails);
		session.getTransaction().commit();
		session.close();
	}

	public void updateAstronautDetails(Astronaut astronautDetails) {
		Session session = OdesseyUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(astronautDetails);
		session.getTransaction().commit();
		session.close();
	}

}
