/*
 * Solves linear equations of the form a⋅x + b = c.
 * The program gets a, b, and c as command-line arguments,
 * computes x, and prints the result.
 * Treats the three arguments as well as the computed value as double values
 */
public class LinearEq {
	public static void main(String[] args) {
		// we want: $java LinearEq 2 5 19
		// to output: 2.0 * x + 5.0 = 19.0
		// X = 7.0
		double a = Integer.valueOf(args[0]);
		double b = Integer.valueOf(args[1]);
		double c = Integer.valueOf(args[2]);
		double x = (c - b) / a;
		System.out.println(a + " * x + " + b + " = " + c);
		System.out.println("x = " + x);
	}
}
