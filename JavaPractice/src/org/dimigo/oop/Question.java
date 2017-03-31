package org.dimigo.oop;

import java.util.Scanner;

/**
 * org.dimigo.oop
 *  \_ Question
 *
 * My favorites
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 31, 2017
 */
public class Question {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] q = { "가수는", "배우는", "과목은" };
		String[] a = { "Zedd", "undefined", "물리" };
		
		for(int i = 0; i < q.length; i++){
			System.out.printf("%d. 가장 좋아하는 %s?%n", i + 1, q[i]);
			
			String yours = scanner.nextLine();
			System.out.println(a[i].equals(yours) ? "정답입니다" : "틀렸습니다");
		}
		
		System.out.println("<< 결과 출력 >>");
		for(int i = 0; i < a.length; i++){
			System.out.printf("가장 좋아하는 %s? %s입니다.%n", q[i], a[i]);
		}
		
		scanner.close();
	}
}
