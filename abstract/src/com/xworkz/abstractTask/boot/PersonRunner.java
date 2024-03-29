package com.xworkz.abstractTask.boot;

import com.xworkz.abstractTask.app.Person;
import com.xworkz.abstractTask.app.Employee;

public class PersonRunner {

	public static void main(String[] args) {
		System.out.println("Running main in PersonRunner");

		Person person = new Employee();

		person.run();
		person.eat();
		person.work();
		person.sleep();
		person.relax();

		System.out.println(person.getOccupation());
		person.study();
		person.celebrateBirthday();
		person.exercise();
		person.getHome();
	}

}
