package functional.programming;

import java.util.stream.Collectors;

public class CharcterCount {
	
	public static void main(String[] args) {
		
		String myString = "hello world";
		
		System.out.println(
			myString
				.chars()
				.mapToObj(c -> String.valueOf((char) c))
				.filter(str -> !str.equals(" "))
				.collect(Collectors.groupingBy(p -> p, Collectors.counting()))
				
		);
	}

}
