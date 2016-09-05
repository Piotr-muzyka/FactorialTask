package FactorialExercise;

public class FactorialCalculation {
	public static long Factorial(int n) {
		long output = 1;

		if (n >= 0 && n <= 14) {
			for (int i = 1; i <= n; i++) {
				output *= i;
			}
		} else {
			System.out.print("Value " + n + " is out of bounds [0,..,14]. ");
		}
		return output;
	}
}
