package com.code.main;

import com.code.main.mathmatics.Mathmatics;

public class Main {

	public static void main(String... strings) {

		Mathmatics math = new Mathmatics();
//		int result = math.lcm.apply(4, 6);
//		int result = math.lcm.apply(12, 15);
//		int result = math.lcm.apply(2, 8);
//		int result = math.lcm.apply(3, 7);
//		boolean result = math.isPrime.test(13);
//		boolean result = math.isPrime.test(101);
//		boolean result = math.isPrime.test(65);
//		boolean result = math.isPrime.test(25);
//		boolean result = math.isPrime.test(1031);
//		math.primeFactor.accept(12);
		math.primeFactor.accept(315);
		// System.out.println(result);
	}
}
