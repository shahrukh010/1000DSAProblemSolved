package com.code.main.mathmatics;

public class Mathmatics {

	public java.util.function.BiFunction<Integer, Integer, Integer> lcm = (a, b) -> {

		int result = 1;
		while (true) {

			if (result % a == 0 && result % b == 0)
				return result;
			result++;
		}
	};

	public java.util.function.Predicate<Integer> isPrime = (n) -> {

		if (n == 1)
			return false;
//
//		for (int i = 2; i < n; i++) {
//
//			if (n % i == 0)
//				return false;
//		}
//		return true;

		// time squre root n
//		for(int i=2;i*i<=n;i++) {
//			
//			if(n%i==0)return false;
//		}
//		return true;

		if (n == 2 || n == 3)
			return true;

		if (n % 2 == 0 || n % 3 == 0)
			return false;

		for (int i = 5; i * i <= n; i = i + 6) {

			if (n % i == 0 || n % (i + 2) == 0)
				return false;
		}
		return true;
	};

	public java.util.function.Consumer<Integer> primeFactor = (n) -> {

		for (int i = 2; i <= n; i++) {

			if (isPrime.test(i)) {
				int x = i;
				while (n % x == 0) {
					System.out.println(i);

					x = x * i;
				}
			}
		}
	};
}
