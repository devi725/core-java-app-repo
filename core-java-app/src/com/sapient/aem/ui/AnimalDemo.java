package com.sapient.aem.ui;

import com.sapient.aem.service.Animal;
import com.sapient.aem.service.Cat;
import com.sapient.aem.service.Dog;
import com.sapient.aem.service.Pet;
import com.sapient.aem.service.Tiger;

public class AnimalDemo {
	public static void main(String[] args) {
		//Array of references of class Animal
		Animal animals[]= new Animal[4];
		animals[0]= new Dog("Omnivorous",6,"pomeranian");
		animals[1]= new Cat("Omnivorous",4,"Bengal Cat");
		animals[2]= new Tiger("Carnivorous",8,"Bengal Tiger");
		animals[3]= new Dog("Omnivorous",10,"labrador");
		
		for(Animal a: animals) {
			if( a instanceof Dog) {
				System.out.println("Dog Details: "+ a) ;
			}else if(a instanceof Cat) {
				System.out.println("cat details: "+a);
			}else if(a instanceof Tiger) {
				System.out.println("Tiger details: "+ a);
			}
		}
		System.out.println("-------------------------");
		//Array of references of interface Pet
		//can hold only instances of its implementation class
		Pet pets[]= new Pet[3];
		pets[0]= new Dog("Omnivorous",6,"pomeranian");
		pets[1]= new Cat("Omnivorous",4,"Bengal cat");
		//cannot convert from Tiger to Pet
//		pets[2]= new Tiger("Carnivorous",8);
		
		for(Pet p: pets) {
			if( p instanceof Dog) {
				System.out.println("Dog Details: "+p);
			}else if(p instanceof Cat) {
				System.out.println("Cat Details: "+p);
			}
			if(p !=null) {
				p.listenToMaster();
			}
		}
		
	}

}
