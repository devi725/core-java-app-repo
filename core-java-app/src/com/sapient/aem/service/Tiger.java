package com.sapient.aem.service;

public class Tiger extends Animal {
	private String Breed;
	
	public Tiger() {
		
	}

	public Tiger(String animalType, Integer age, String breed) {
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
		System.out.println("Roar's");
	}
	
	@Override
	public String toString() {
		return super.toString();
	}


}
