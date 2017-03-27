package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ CarTest3
 *
 * Third car test
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 27, 2017
 */
public class CarTest3 {
	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		print(new Car3("현대자동차", "제네시스", "검정색", 225, 50000000));
		print(new Car3("기아자동차", "K7", "흰색", 246));
		print(new Car3("삼성자동차", "SM7", "회색"));
	}
	
	public static void print(Car3 car) {
		System.out.printf("제조사명 : %s%n모델명 : %s%n색상 : %s%n최대속도 : %dkm%n가격 : %,d원%n%n", 
				car.getCompany(), car.getModel(), car.getColor(), car.getMaxSpeed(), car.getPrice());
	}
}
