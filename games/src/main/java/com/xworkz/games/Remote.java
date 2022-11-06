package com.xworkz.games;

public class Remote {
	
	String name;
	Double price;
	Games games;
	
	public Remote() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Games getGames() {
		return games;
	}

	public void setGames(Games games) {
		this.games = games;
	}

	public Remote(String name, Double price, Games games) {
		super();
		this.name = name;
		this.price = price;
		this.games = games;
	}

	@Override
	public String toString() {
		return "Remote [name=" + name + ", price=" + price + ", games=" + games + "]";
	}
	

}
