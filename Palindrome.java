package functional.programming;

import java.util.stream.IntStream;

public class Palindrome {
  
  public boolean isPalindromeFunctional(int number) {
		return number == IntStream.iterate(number, i -> i / 10)
			.map(num -> num % 10)
			.limit(String.valueOf(number).length())
			.reduce(0, (carry, val) -> carry * 10 + val);
    }
	
	public boolean isPalindromeImperative(int number) {
		int n = number;
		int digit;
		int reverse = 0;
		
		do {
			digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n / 10;
		} while (n > 0);
		
		return reverse == number;
	}
}
