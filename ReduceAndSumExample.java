package functional.programming;

import java.util.Arrays;
import java.util.List;

public class ReduceAndSumExample {

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(12, 13, 18, 20, 25, 56, 67, 39, 82, 37, 44, 8, 6, 88);

		// using reduce method
		System.out.println(
			integers.stream()
				.filter(i -> i > 10)
				.filter(i -> i % 2 == 0)
				.map(i -> i * 2)
				.reduce(0, (x, y) -> x + y)
		);

		// using specialized reduce method sum
		System.out.println(
			integers.stream()
				.filter(i -> i > 10)
				.filter(i -> i % 2 == 0)
				.mapToInt(i -> i * 2)
				.sum()
		);

	}
}
