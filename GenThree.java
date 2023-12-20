/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

public class GenThree {
	public static void main(String[] args) {
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int range = (max - min);
		int rand_int1 = (int) (Math.random() * range) + min;
		int rand_int2 = (int) (Math.random() * range) + min;
		int rand_int3 = (int) (Math.random() * range) + min;
		System.out.println(rand_int1);
		System.out.println(rand_int2);
		System.out.println(rand_int3);
		System.out.println("The minimal generated value was: "
				+ Math.min(Math.min(rand_int1, rand_int2), Math.min(rand_int2, rand_int3)));

	}
}
