package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
	@Autowired
	private String teamName;
	@Autowired
	private int noOfPlayers;
	@Autowired
	private TeamCaptain teamCaptain;

	public String getTeamName() {
		return teamName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void display() {
		System.out.println(teamCaptain.getTeamCaptainName());
		System.out.println(teamCaptain.getTeamCaptainAge());
	}

}
