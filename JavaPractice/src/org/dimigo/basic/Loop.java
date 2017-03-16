package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * org.dimigo.basic
 *  \_ Loop
 *
 * 간단한 게임 프로그램
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 15, 2017
 */
public class Loop {
	public static void main(String[] args) {
		int choice, power = 100;
		Scanner scanner = new Scanner(System.in);
		String[] list = {"마법사", "영주", "기사", "농민"};
		
		do {
			System.out.printf(
					"---------------%n" +
					"<< 게임 메뉴 >>%n" +
					"1. 공격력 증가%n" +
					"2. 공격력 감소%n" +
					"3. 캐릭터 설정%n" +
					"9. 종료%n" +
					"---------------%n" +
					"메뉴 입력 => ");
			
			switch(choice = scanner.nextInt()){
				default: /***/ System.out.printf("잘못된 메뉴: %d%n", choice);
				break; case 1: System.out.printf("공격력 증가: %d%n", power += 10);
				break; case 2: System.out.printf("공격력 감소: %d%n", power -= 10);
				break; case 3: System.out.printf("캐릭터 설정: %s%n", list[new Random().nextInt(list.length)]);
				break; case 9: System.out.println("프로그램 종료"); scanner.close();
			}
		} while(choice != 9);
	}
}
