package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ Car3
 *
 * Third car!
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 27, 2017
 */
public class Car3 {
	private String company, model, color;
	private int maxSpeed, price;
	
	public Car3(){
		// nothing to do
	}
	
	public Car3(String company, String model, String color, int maxSpeed, int price) {
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed) {
		this(company, model, color, maxSpeed, 0);
	}
	
	public Car3(String company, String model, String color) {
		this(company, model, color, 0);
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String newCompany) {
		company = newCompany;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String newModel) {
		model = newModel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String newColor) {
		color = newColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int newPrice) {
		price = newPrice;
	}
}
