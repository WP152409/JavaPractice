package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ FamilyMember
 *
 * lorem ipsum
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 18, 2017
 */
public class FamilyMember {
	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName){
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName(){
		return this.memberName;
	}
	
	public static void printMemberCnt() {
		System.out.printf("가족 총 인원 수 : %d명%n", memberCnt);
	}
}
