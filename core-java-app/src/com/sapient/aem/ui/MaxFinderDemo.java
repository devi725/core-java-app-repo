package com.sapient.aem.ui;

import com.sapient.aem.service.MaxFinder;
import com.sapient.aem.service.MaxfinderImpl;

public class MaxFinderDemo {

	public static void main(String[] args) {
		//instance of the implementation class pointed by its interface type
				MaxFinder maxFinder= new MaxfinderImpl();
				System.out.println(maxFinder.maximum(120000, 115000));

			}

}
