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
		String[][] list = {{"가수는", "Zedd"}, {"배우는", "undefined"}, {"과목은", "물리"}};
		
		for(int i = 0; i < list.length; i++){
			System.out.printf("%d. 가장 좋아하는 %s?%n", i + 1, list[i][0]);
			System.out.println(list[i][1].equals(scanner.nextLine()) ? "정답입니다" : "틀렸습니다");
		}
		
		StringBuilder b = new StringBuilder();
		for(String[] item: list) b
				.append("가장 좋아하는 ").append(item[0]).append("? ")
				.append(item[1]).append("입니다.").append(System.lineSeparator());
		
		System.out.printf("<< 결과 출력 >>%n%s%n", b.toString());
		scanner.close();
	}
}
