/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */

import java.util.Random;

public class GenThree {
	public static void main(String[] args) {
		Random rand = new Random();
		int min = Integer.parseInt(args[0]);
		int max = Integer.parseInt(args[1]);
		int base = max - min;
		int rand_int1 = rand.nextInt(base) + min;
		int rand_int2 = rand.nextInt(base) + min;
		int rand_int3 = rand.nextInt(base) + min;
		System.out.println(rand_int1);
		System.out.println(rand_int2);
		System.out.println(rand_int3);
		System.out.println("The minimal generated value was: "
				+ Math.min(Math.min(rand_int1, rand_int2), Math.min(rand_int2, rand_int3)));

	}
}
