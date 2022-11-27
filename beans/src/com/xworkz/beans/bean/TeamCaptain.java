package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamCaptain {
	@Autowired
	private String teamCaptainName;
	@Autowired
	private int teamCaptainAge;

	public String getTeamCaptainName() {
		return teamCaptainName;
	}

	public int getTeamCaptainAge() {
		return teamCaptainAge;
	}

}
