package org.dimigo.oop;

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
		Snack[] snacks = new Snack[] {
			new Snack("새우깡", "농심", 1100, 2),
			new Snack("콘칲", "크라운", 1200, 1),
			new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int sum = 0;
		for(Snack snack: snacks) {
			sum += snack.calcPrice();
			System.out.println(snack.toString());
		}
		
		System.out.printf("총 구매 금액 : %,d원%n", sum);
	}
}
