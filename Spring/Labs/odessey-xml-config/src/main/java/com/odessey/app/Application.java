package com.odessey.app;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.service.OdesseyService;

public class Application {

	
	private  static void viewMissionDetails(){
		System.out.println("Viewing Missions of Odessey");
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
		OdesseyService odesseyService=(OdesseyService)applicationcontext.getBean("odesseymissionservice");
		
		List<Mission> viewMissionList=new ArrayList<Mission>();
		viewMissionList=odesseyService.getMissionDetails();
		
		//Displaying the records
		
		viewMissionList.forEach(System.out::println);
		
	}
	private  static void viewAstronautDetails(){
		System.out.println("Viewing Missions of Astronauts");
		ApplicationContext applicationcontext=new ClassPathXmlApplicationContext("applicationContext.xml");
		OdesseyService odesseyService=(OdesseyService)applicationcontext.getBean("odesseyastronautservice");
		
		List<Astronaut> viewAstronautList=new ArrayList<Astronaut>();
		viewAstronautList=odesseyService.getAstronautDetails();
		
		//Displaying the records
		
		viewAstronautList.forEach(System.out::println);
		
	}
	
	public static void main(String[] args) {
		viewMissionDetails();
		viewAstronautDetails();
	}
}
