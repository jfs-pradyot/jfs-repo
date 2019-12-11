package com.odessey.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.odessey.model.Astronaut;
import com.odessey.model.Mission;
import com.odessey.service.OdesseyService;

@RestController
public class OdesseyController {

	
	private OdesseyService odesseyService;
	
	@RequestMapping(value="/missiondetails", method = RequestMethod.GET)
	List<Mission> viewMissionDetails() {
		return odesseyService.getMissionDetails();

	}
	@RequestMapping(value="/astrodetails", method = RequestMethod.GET)
	List<Astronaut> viewAstronautDetails() {
		return odesseyService.getAstronautDetails();


	}

	public static void updateMissionDetails() {
	

	}

	public static void updateAstronautDetails() {
		

	}

	
}
