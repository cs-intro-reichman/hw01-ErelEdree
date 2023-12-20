/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {

		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = a + b;
		System.out.println(a + " + " + b + " = " + c);
	}

}