package com.sapient.aem.service;

public class Dog extends Animal implements Pet {
	private String Breed;
	
	public Dog() {
		
	}

	public Dog(String animalType, Integer age, String breed) {
		super(animalType, age);
		Breed = breed;
	}
	
	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Bhou bhou..");
	}

	@Override
	public void listenToMaster() {
		System.out.println("Go and the get ball...");
	}
	
	@Override
	public String toString() {
		return   super.toString()+"\nBreed=" + Breed ;
	}

}
