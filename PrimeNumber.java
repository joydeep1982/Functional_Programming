package functional.programming;

import java.util.stream.IntStream;

public class PrimeNumber {

	public static boolean isPrimeImperative(int number) {
		
        boolean divisible = false;
        for (int i = 2; i < number; i++) {
                if (number % 2 == 0) {
                        divisible = true;
                        break;
                }
        }		
        return number > 1 && !divisible;
	}
  
    public static boolean isPrimeFunctional(int number) {
		return number > 1 && 
            IntStream.range(2, number)
                .noneMatch(i -> number % i == 0);
    }
    
}
