package com.sapient.aem.service;

public class Cat extends Animal implements Pet {
	private String Breed;
	
	public Cat() {
		
	}

	public Cat(String animalType, Integer age, String breed) {
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
	public void listenToMaster() {
		System.out.println("Go and the get ball...");
		
	}

	@Override
	public void makeSound() {
		System.out.println("Meow Meow..");
		
	}

	@Override
	public String toString() {
		return   super.toString()+"\nBreed=" + Breed ;
	}
}
