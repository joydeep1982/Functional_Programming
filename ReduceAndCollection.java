package functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReduceAndCollection {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(12, 13, 18, 20, 25, 56, 67, 39, 82, 37, 44, 8, 6, 88);

		// Implementing collect
		System.out.println(integers.stream()
				.filter(i -> i < 10)
				.filter(i -> i % 2 == 0)
				.map(i -> i * 2)
				.collect(ArrayList::new, 
						(left, right) -> left.add(right), 
						(left, right) -> left.addAll(right))
		);

		// Using specialized list collector
		System.out.println(integers.stream()
				.filter(i -> i < 10)
				.filter(i -> i % 2 == 0)
				.map(i -> i * 2)
				.collect(Collectors.toList())
		);
	}
}
