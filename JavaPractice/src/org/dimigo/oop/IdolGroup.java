package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ IdolGroup
 *
 * Idol group
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 10, 2017
 */
public class IdolGroup {
	public static void main(String[] args) {
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = {
			{"GD", "태양", "대성", "탑", "승리"},
			{"CL", "산다라박", "박봄", "민지"},
			{"유라", "혜리", "소진", "민아"}
		};
		for(int i = 0; i < groupName.length; i++)
			System.out.printf("<< %s >>%n%s%n%n", groupName[i],
				String.join(System.lineSeparator(), memberName[i]));
	}
}
