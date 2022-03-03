package com.sapient.aem.ui;

import com.sapient.aem.service.Factorial;


public class FatorialUsingLamda {

	public static void main(String[] args) {
		Factorial factorial= (n) -> {
			Long fact = 1l;
			for(int i =1;i<=n;i++) {
				fact  = fact * i;
			}
			return fact;
		};
		System.out.println(factorial.factorial(6));
	}

}
