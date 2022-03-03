package com.sapient.aem.service;

public abstract class Shape {
	/* defining a method that computes and returns area of a Shape is
	 * not possible because Shape doesn't have formula but type of Shape
	 * has formula.
	 * 
	 * But to achieve runtime-polymorphism, the method should exist in super
	 * class and has to be overridden in sub class
	 * 
	 */
	
	//abstract method, a method without body
	/*
	 * If a class has one or more abstract methods, the class too has to 
	 * be declared as abstract.
	 * 
	 * An abstract class cannot be instantiated.
	 * When a method is declared as abstract, it is expected that its
	 * sub classes will implement the method.
	 * 
	 * If sub class doesn't override the abstract method of its sub class, then
	 * sub class also has to be declared as abstract.
	 * 
	 * An abstract class is like any other class means it can contain data members, 
	 * constructors, concrete methods and so on.
	 * 
	 * Apart from these an abstract class may contain one or more abstract methods.
	 */
	public abstract double area();

}
