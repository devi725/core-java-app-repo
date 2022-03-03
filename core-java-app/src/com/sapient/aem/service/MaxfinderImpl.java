package com.sapient.aem.service;

public class MaxfinderImpl implements MaxFinder {
	@Override
	public int maximum(int a, int b) {		
		return (a>b)?a:b;
	}

}
