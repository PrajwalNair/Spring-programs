package com.xworkz.games;

public class Games {
	
	String name;
	Double noOfPlayers;
	
	
	public Games() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}


	public Games(String name, Double noOfPlayers) {
		super();
		this.name = name;
		this.noOfPlayers = noOfPlayers;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getNoOfPlayers() {
		return noOfPlayers;
	}


	public void setNoOfPlayers(Double noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}


	@Override
	public String toString() {
		return "Games [name=" + name + ", noOfPlayers=" + noOfPlayers + "]";
	}

}
