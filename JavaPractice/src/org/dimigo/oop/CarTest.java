package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ CarTest
 *
 * CAR!
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 23, 2017
 */
public class CarTest {

	public static void main(String[] args) {
		Car genesis = new Car();
		genesis.setCompany("현대자동차");
		genesis.setModel("제네시스");
		genesis.setColor("검정색");
		genesis.setMaxSpeed(225);
		genesis.setPrice(50000000);
		
		Car k7 = new Car();
		k7.setCompany("기아자동차");
		k7.setModel("K7");
		k7.setColor("흰색");
		k7.setMaxSpeed(246);
		k7.setPrice(40000000);
		
		Car sm7 = new Car();
		sm7.setCompany("삼성자동차");
		sm7.setModel("SM7");
		sm7.setColor("회색");
		sm7.setMaxSpeed(200);
		sm7.setPrice(38000000);
		
		System.out.println("<< 자동차 목록 >>");
		print(genesis); print(k7); print(sm7);
	}
	
	public static void print(Car car){
		System.out.printf("제조사명 : %s%n모델명 : %s%n색상 : %s%n최대속도 : %dkm%n가격 : %,d원%n%n", 
				car.getCompany(), car.getModel(), car.getColor(), car.getMaxSpeed(), car.getPrice());
	}
}
