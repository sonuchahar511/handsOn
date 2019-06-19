package com.chahar.collectionwithstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PlayWithListViaStream {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Mohamed", 69));
		people.add(new Person("Doaa", 25));
		people.add(new Person("Malik", 6));

		Predicate<Person> pred = (p) -> p.getAge() > 65;

		displayPeople(people, pred);
	}

	private static void displayPeople(List<Person> people, Predicate<Person> pred) {

		/**
		 * System.out.println("Selected:"); people.forEach(p -> { if (pred.test(p)) {
		 * System.out.println(p.getName()); } });
		 */
		System.out.println("All Persons:");
		people.stream().forEach(p -> System.out.println(p.getName()));
		System.out.println("Selected:");
		people.stream().filter(pred).forEach(p -> System.out.println(p.getName()));
		people.stream().parallel().filter(pred).forEach(p -> System.out.println(p.getName()));
	}
}
