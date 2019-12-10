package com.odessey.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.service.OdesseyService;

public class Application {

	private static void viewMissionDetails() {
		System.out.println("Viewing Missions of Odessey");
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService = (OdesseyService) applicationcontext.getBean("odesseymissionservice");

		List<Mission> viewMissionList = new ArrayList<Mission>();
		viewMissionList = odesseyService.getMissionDetails();

		// Displaying the records

		viewMissionList.forEach(System.out::println);

	}

	private static void viewAstronautDetails() {
		System.out.println("Viewing Missions of Astronauts");
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService = (OdesseyService) applicationcontext.getBean("odesseyastronautservice");

		List<Astronaut> viewAstronautList = new ArrayList<Astronaut>();
		viewAstronautList = odesseyService.getAstronautDetails();

		// Displaying the records

		viewAstronautList.forEach(System.out::println);

	}

	public static void updateMissionDetails() {
		Mission missionDetails = new Mission();
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService = (OdesseyService) applicationcontext.getBean("odesseymissionservice");

		missionDetails.setMissionID("M04");
		missionDetails.setMissionName("Interstellar");
		missionDetails.setSpaceCraft("Voyager-2");
		missionDetails.setAgency("NASA");
		missionDetails.setStatus("Success");

		odesseyService.updateMissionDetails(missionDetails);

	}

	public static void updateAstronautDetails() {
		Astronaut astronautDetails = new Astronaut();
		ApplicationContext applicationcontext = new AnnotationConfigApplicationContext(AppConfig.class);
		OdesseyService odesseyService = (OdesseyService) applicationcontext.getBean("odesseyastronautservice");

		astronautDetails.setAstronautId("A04");
		astronautDetails.setAstronautName("Kalpana");
		astronautDetails.setAstronautGender("Female");
		astronautDetails.setAstronautCountry("India");
		odesseyService.updateAstronautDetails(astronautDetails);

	}

	public static void main(String[] args) {
//		updateMissionDetails();

//		updateAstronautDetails();
//		viewMissionDetails();
		viewAstronautDetails();
	}
}
