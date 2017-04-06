/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ Snack
 *
 * Snack
 *
 * @author chalk
 * @version 1.0.0
 * @since Apr 6, 2017
 */
public class Snack {
	private String name, company;
	private int price, number;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public int calcPrice() {
		return price * number;
	}
	
	public String toString() {
		return String.format("이름 : %s%n제조사 : %s%n가격 : %,d원%n개수 : %d개%n", name, company, price, number);
	}
}
