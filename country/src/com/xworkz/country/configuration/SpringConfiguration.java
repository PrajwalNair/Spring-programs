package com.xworkz.country.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.country.beans.Education;
import com.xworkz.country.beans.Name;
import com.xworkz.country.beans.President;
import com.xworkz.country.beans.Salary;
import com.xworkz.country.beans.State;
import com.xworkz.country.beans.UnionTerritories;
import com.xworkz.country.beans.VicePresident;
import com.xworkz.country.enums.Type;

@Configuration
@ComponentScan("com.xworkz")
public class SpringConfiguration {

	@Bean
	public Type type() {
		return Type.PERSON;
	}


	@Bean
	public Name presidentName() {
		Name name = new Name();
		name.setFirstName("Droupadi");
		name.setLastName("");
		name.setMiddleName("murmu");
		return name;
	}
	
	@Bean
	public Name primeMinisterName() {
		Name name = new Name();
		name.setFirstName("Narendra");
		name.setLastName("D");
		name.setMiddleName("Modi");
		return name;
	}
	

	@Bean
	public Name VicePresidentName() {
		Name name = new Name();
		name.setFirstName("Ramnath");
		name.setLastName("f");
		name.setMiddleName("Kovind");
		return name;
	}
	
	@Bean
	public Salary presidentSalary() {
		Salary salary = new Salary(50000, 432000, 5000, 4000, 4500, 1500, 2000, 3500);
		return salary;
	}
	
	@Bean
	public Salary primeMinisterSalary() {
		Salary salary = new Salary(50000, 432000, 5000, 4000, 4500, 1500, 2000, 3500);
		return salary;
	}
	
	@Bean
	public State primeMinisterState() {
		State state = new State("Gujarat", 500000, "Ahmadabad", 25, 226251, "amit shah", "gujarati");
		return state;
	}
	
	@Bean
	public Education presidentEducation() {
		Education education = new Education(115, "VTU", "mechanical", 1990, "ahmedabad", 5, 75.29, true);
		return education;
	}
	
	@Bean
	public Education primeMinisterEducation() {
		Education education = new Education(254, "Reva", "chemical", 1992, "ahmedabad", 5, 65.29, true);
		return education;
	}
	
	@Bean
	public Salary VicePresidentSalary() {
		Salary salary = new Salary(1.0, 20.0, 30.0, 40.0, 50.0, 60.0, 70.0, 80.0);
		return salary;
	}
	
	@Bean
	public Education VicePresidentEducation() {
		Education education = new Education(115, "VTU", "mechanical", 1990, "ahmedabad", 5, 75.29, true);
		return education;
	}
	
	@Bean
	public UnionTerritories[] unionTerritories() {
		UnionTerritories territories = new UnionTerritories("lakshadweep", 515, "bcbc", 16564);
		UnionTerritories territories1 = new UnionTerritories("ladakh", 1656, "bxcjhb", 51454);
		UnionTerritories [] ref = {territories,territories1};
//		for (UnionTerritories unionTerritories : ref) {
//			System.out.println(unionTerritories);
//		}
		return ref;
		
	}
	
	

}
