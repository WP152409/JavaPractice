package org.dimigo.oop;

import java.util.Arrays;

/**
 * org.dimigo.oop
 *  \_ SnackTest
 *
 * Snack array
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 7, 2017
 */
public class SnackTest {
	public static void main(String[] args) {
		System.out.printf(
			"총 구매 금액 : %,d원%n",
			Arrays.stream(new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
			})
			.peek(System.out::println)
			.mapToInt(Snack::calcPrice).sum());
	}
}
