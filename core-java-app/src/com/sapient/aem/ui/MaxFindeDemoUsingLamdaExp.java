package com.sapient.aem.ui;

import com.sapient.aem.service.MaxFinder;

public class MaxFindeDemoUsingLamdaExp {

	public static void main(String[] args) {
		MaxFinder maxFinder= (a,b) -> (a>b)?a:b;
		System.out.println(maxFinder.maximum(10,5));

	}

}
