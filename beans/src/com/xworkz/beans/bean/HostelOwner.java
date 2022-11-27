package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HostelOwner {
	@Autowired
	private String hostelOwnerName;
	@Autowired
	private int hostelOwnerAge;

	public String getHostelOwnerName() {
		return hostelOwnerName;
	}

	public int getHostelOwnerAge() {
		return hostelOwnerAge;
	}

}
