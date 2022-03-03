package com.sapient.aem.ui;

import com.sapient.aem.service.A;
import com.sapient.aem.service.B;
import com.sapient.aem.service.C;

public class PolymorphismDemo {

	public static void main(String[] args) {
			A aobj= new A();
			aobj.m();// method m() of class A is invoked
			System.out.println("---------------------------");
			aobj= new B();
			aobj.m();//method m() of class B is invoked
			System.out.println("---------------------------");
			aobj= new C();
			aobj.m();//method m() of class C is invoked

	}

}
