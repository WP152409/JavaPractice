package org.dimigo.basic;

/**
 * org.dimigo.basic
 *  \_ PrimitiveDataType
 *
 * 아이유 프로필 출력하기
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 9, 2017
 */
public class PrimitiveDataType {
	public static void main(String[] args) {
		String  name      = "아이유";
		boolean isMale    = false;
		int     age       = 25;
		double  height    = 161.8;
		float   weight    = 44.3f;
		char    bloodType = 'A';
		
		System.out.printf("<< %s 프로필 >>%n이름 : %s%n성별 : %c자%n나이 :" +
				" %s세%n키 : %.1fcm%n몸무게 : %.1fkg%n혈액형 : %c형%n", name,
				name, isMale ? '남' : '여', age, height, weight, bloodType);
	}
}
