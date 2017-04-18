package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ PiggyBank
 *
 * lorem ipsum
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 18, 2017
 */
public class PiggyBank {
	private static int balance = 0;
	
	public static void printBalance(){
		System.out.printf("돼지저금통 총 금액 : %d원%n", balance);
	}
	
	public static void putMoney(FamilyMember member, int amount){
		if (amount <= 0) return;
		
		balance += amount;
		System.out.printf("%s : %d원 넣음%n", member.getMemberName(), amount);
	}
}
