package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.StreamSupport;

import org.practice.session.Gender;
import org.practice.session.Person;

public class IteratorWithStreams {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>(
				Arrays.asList(
					new Person("Jack", 2, Gender.MALE),
					new Person("John", 32, Gender.MALE),
					new Person("Angela", 80, Gender.FEMALE),
					new Person("Harry", 45, Gender.MALE),
					new Person("Paul", 18, Gender.MALE),
					new Person("Alice", 33, Gender.FEMALE),
					new Person("Monalisa", 66, Gender.FEMALE),
					new Person("Precilla", 16, Gender.FEMALE)
				)
			);
		
		Iterator<Person> itr = people.iterator();
		
		StreamSupport.stream(Spliterators.spliteratorUnknownSize(itr, Spliterator.DISTINCT), false)
			.filter(p -> p.getGender() == Gender.MALE)
			.forEach(System.out::println);
	}

}
