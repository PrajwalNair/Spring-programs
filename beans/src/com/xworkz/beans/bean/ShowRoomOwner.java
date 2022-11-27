package com.xworkz.beans.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class ShowRoomOwner {
	@Autowired
	private String showRoomOwnerName;
	@Autowired
	private int showRoomOwnerAge;

	public String getShowRoomOwnerName() {
		return showRoomOwnerName;
	}

	public int getShowRoomOwnerAge() {
		return showRoomOwnerAge;
	}

}
