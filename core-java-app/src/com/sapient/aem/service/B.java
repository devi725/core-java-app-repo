package com.sapient.aem.service;

public class B extends A{
	@Override
	public void m(){
		//m(); // recursive method, a method calling itself
		// super.m();// invoking super class, m()
		System.out.println(" Welcome");

	}

}
