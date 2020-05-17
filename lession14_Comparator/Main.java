package lession14_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		ArrayList<Person> person = new ArrayList<Person>();
		person.add(new Person("Ivan",25,100));
		person.add(new Person("Petro",50,80));
		person.add(new Person("Dmytro",50,81));
		person.add(new Person("Oleg",25,90));
		person.add(new Person("Ivan",25,75));
		person.add(new Person("Petro",50,101));
	
		for (Person person2 : person) {
			System.out.println(person2);
		}
		System.out.println("сортування за замовчуванням");
		Collections.sort(person);
		for (Person person2 : person) {
			System.out.println(person2);
		}
		System.out.println("сортування з Компаратором (за 2-ма полями)");
		Collections.sort(person, new PersonComparator());
		for (Person person2 : person) {
			System.out.println(person2);
		}
	}
	
	

}
