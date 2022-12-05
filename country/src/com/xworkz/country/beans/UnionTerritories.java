package com.xworkz.country.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UnionTerritories {
	@Autowired
	private Lakshadweep lakshadeep;
	@Autowired
	private AndamanAndNicobar andamanAndaaNicobar;
	@Override
	public String toString() {
		return "UnionTerritories [lakshadeep=" + lakshadeep + ", andamanAndaaNicobar=" + andamanAndaaNicobar + "]";
	}

	

}
