package com.sapient.aem.service;

public abstract class Animal {
	private String animalType;
	private Integer age;
	
	public Animal() {		
		
	}

	public Animal(String animalType, Integer age) {
		super();
		this.animalType = animalType;
		this.age = age;
	}

	public String getAnimalType() {
		return animalType;
	}

	public Integer getAge() {
		return age;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
	public abstract void makeSound();
	

@Override
	public String toString() {
		return "\nAnimalType=" + animalType + "\nAge=" + age ;
	}


}
