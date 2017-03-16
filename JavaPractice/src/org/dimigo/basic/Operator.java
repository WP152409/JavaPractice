package org.dimigo.basic;

/**
 * org.dimigo.basic
 *  \_ Operator
 *
 * 디미베네
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 14, 2017
 */
public class Operator {
	public static void main(String[] args) {
		long salary = 1700000L, employees= 3L, stores = 1500L;

		System.out.printf(
				"<< 디미베네 연간 인건비 >>%n월 평균 급여 : %,d원%n점포 내 직원 수 : %d명%n"
				+ "점포 수 : %,d개%n%n연간 인건비 : %,d원%n", salary, employees, stores,
				12L * salary * employees * stores);
	}
}
