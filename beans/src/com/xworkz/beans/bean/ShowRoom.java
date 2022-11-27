package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ShowRoom {
	@Autowired
	private String showRoomName;
	@Autowired
	private double showRoomRating;
	@Autowired
	private ShowRoomOwner showRoomOwner;

	public String getShowRoomName() {
		return showRoomName;
	}

	public double getShowRoomRating() {
		return showRoomRating;
	}
	
	public void display() {
		System.out.println(showRoomOwner.getShowRoomOwnerName());
		System.out.println(showRoomOwner.getShowRoomOwnerAge());
	}

}
