package com.sapient.aem.service;
import java.util.Comparator;

import com.sapient.aem.service.Person;

public class PersonNameComparator  implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {		
		return o1.getName().compareTo(o2.getName());
	}

}
