package com.xworkz.beans.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.beans.bean.Hotel;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfig {

	public SpringConfig() {
		System.out.println(getClass().getSimpleName());
	}

	@Bean
	public Hotel hotel() {
		Hotel hotel = new Hotel();
		return hotel;
	}

	@Bean
	public String hotelName() {
		return "Gokul";
	}

	@Bean
	public String hospitalName() {
		return "Jayadeva";
	}

	@Bean
	public String ownerName() {
		return "basu";
	}

	@Bean
	public String founderName() {
		return "dyamanna";
	}

	@Bean
	public int age() {
		return 28;
	}

	@Bean
	public int founderAge() {
		return 50;
	}

	@Bean
	public double hotelRating() {
		return 4.5;
	}

	@Bean
	public double hospitalRating() {
		return 4.7;
	}

	@Bean
	String instituteName() {
		return "xyz";
	}

	@Bean
	public double instituteRating() {
		return 4.9;
	}

	@Bean
	public String trainerName() {
		return "suhas";
	}

	@Bean
	public int trainerAge() {
		return 27;
	}

	@Bean
	public String pgName() {
		return "Krishna";
	}

	@Bean
	public double pgRent() {
		return 5000.00;
	}

	@Bean
	public String pgOwnerName() {
		return "bala";
	}

	@Bean
	public int pgOwnerAge() {
		return 38;
	}

	@Bean
	public String hostelName() {
		return "venkatesh";
	}

	@Bean
	public double hostelRent() {
		return 5500.00;
	}

	@Bean
	public String hostelOwnerName() {
		return "honey";
	}

	@Bean
	public int hostelOwnerAge() {
		return 32;
	}

	@Bean
	public String houseName() {
		return "honey bee";
	}

	@Bean
	public double houseCost() {
		return 1500000.00;
	}

	@Bean
	public String houseOwnerName() {
		return "honey";
	}

	@Bean
	public int houseOwnerAge() {
		return 32;
	}

	@Bean
	public String shopName() {
		return "triangle Bookstall";
	}

	@Bean
	public double shopRent() {
		return 10000.00;
	}

	@Bean
	public String shopOwnerName() {
		return "darshan";
	}

	@Bean
	public int shopOwnerAge() {
		return 32;
	}

	@Bean
	public String apartmentName() {
		return "lotus";
	}

	@Bean
	public int noOfFloors() {
		return 5;
	}

	@Bean
	public int capacity() {
		return 6;
	}

	@Bean
	public String doorType() {
		return "automatic";
	}

	@Bean
	public String company() {
		return "indigo";
	}

	@Bean
	public int noOfSeats() {
		return 50;
	}

	@Bean
	public String pilotName() {
		return "manoj";
	}

	@Bean
	public int pilotAge() {
		return 35;
	}

	@Bean
	public int noOfPassengers() {
		return 65;
	}

	@Bean
	public String captainName() {
		return "malatesh";
	}

	@Bean
	public int captainAge() {
		return 40;
	}

	@Bean
	public String color() {
		return "grey";
	}

	@Bean
	public String teamName() {
		return "India";
	}

	@Bean
	public int noOfPlayers() {
		return 11;
	}

	@Bean
	public String teamCaptainName() {
		return "Rohit Sharma";
	}

	@Bean
	public int teamCaptainAge() {
		return 35;
	}

	@Bean
	public String showRoomName() {
		return "Bajaj";
	}

	@Bean
	public double showRoomRating() {
		return 4.8;
	}

	@Bean
	public String showRoomOwnerName() {
		return "raghu";
	}

	@Bean
	public int showRoomOwnerAge() {
		return 42;
	}

	@Bean
	public String brand() {
		return "crompton";
	}

	@Bean
	public double fanPrice() {
		return 5000.00;
	}

	@Bean
	public String capacitorBrand() {
		return "vishaya";
	}

	@Bean
	public int capacitorValue() {
		return 50;
	}

	@Bean
	public String mobileBrand() {
		return "vivo";
	}

	@Bean
	public double mobilePrice() {
		return 18500;
	}

	@Bean
	public String simCompany() {
		return "Airtel";
	}

	@Bean
	public String network() {
		return "4G";
	}

	@Bean
	public String laptopBrand() {
		return "Dell";
	}

	@Bean
	public double laptopPrice() {
		return 35000.00;
	}

	@Bean
	public String graphicCardBrand() {
		return "Nvdia";
	}

	@Bean
	public double graphicCardPrice() {
		return 4000.00;
	}

	@Bean
	public String oyoName() {
		return "honey";
	}

	@Bean
	public double oyoPrice() {
		return 1500.00;
	}

	@Bean
	public String customerName() {
		return "suhas";
	}

	@Bean
	public int noOfCustomer() {
		return 10;
	}

	@Bean
	public String gymName() {
		return "Sparten";
	}

	@Bean
	public double gymFees() {
		return 500.00;
	}

	@Bean
	public String gymTrainerName() {
		return "Anil pujari";
	}

	@Bean
	public int gymTrainerAge() {
		return 33;
	}

	@Bean
	public String restaurentName() {
		return "rejintal";
	}

	@Bean
	public double restaurentRating() {
		return 4.95;
	}

	@Bean
	public String country() {
		return "india";
	}

	@Bean
	public String state() {
		return "karnataka";
	}

	@Bean
	public int noOfAccountants() {
		return 33;
	}

	@Bean
	public int noOfSecurities() {
		return 33;
	}

	@Bean
	public String stationName() {
		return "Hubli";
	}

	@Bean
	public int noOfPlatforms() {
		return 6;
	}

	@Bean
	public int noOfBoggies() {
		return 10;
	}

	@Bean
	public int noOfPassenger() {
		return 250;
	}

	@Bean
	public String schoolName() {
		return "BMEMS";
	}

	@Bean
	public int since() {
		return 1952;
	}

	@Bean
	public String studentName() {
		return "Hanamant";
	}

	@Bean
	public int studentAge() {
		return 15;
	}
	
	@Bean
	public String collegeName() {
		return "PC Jabin";
	}
	
	@Bean
	public double collegeRating() {
		return 4.9;
	}
	
	@Bean
	public String keyBoardBrand() {
		return "Dell";
	}
	
	@Bean
	public int keyBoardPrice() {
		return 800;
	}
	
	@Bean
	public String cellBrand() {
		return "Nippo";
	}
	
	@Bean
	public int cellPrice() {
		return 10;
	}
	
	@Bean
	public String mouseBrand() {
		return "Dell";
	}
	
	@Bean
	public int mousePrice() {
		return 300;
	}

}
