package com.chahar.collectionwithstreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class PlayWithCollectionViaStream {
	public static void main(String args[]) {
		  
	    Person[] people = {
	        new Person("Mohamed", 69),
	        new Person("Doaa", 25),
	        new Person("Malik", 6)};
	    for (int i = 0; i < people.length; i++) {
	        System.out.println(people[i].getInfo());
	    }
	    Stream<Person> stream = Stream.of(people);
        stream.forEach(p -> System.out.println(p.getInfo()));
        Stream<Person> stream1 = Arrays.stream(people);
        stream.forEach(p -> System.out.println(p.getInfo()));
	}
}
