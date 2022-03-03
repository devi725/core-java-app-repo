package com.sapient.aem.ui;

import com.sapient.aem.service.PowerOfNum;

public class PowerOfNumUsingLamda {

	public static void main(String[] args) {
		PowerOfNum power = (a,b) ->{
			a = (int) Math.pow(a,b);
			return a;
		};
		System.out.println(power.power(2,4));
	}

}
