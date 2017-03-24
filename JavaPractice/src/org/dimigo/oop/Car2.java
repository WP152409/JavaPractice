/**
 * 
 */
package org.dimigo.oop;

/**
 * org.dimigo.oop
 *  \_ Car2
 *
 * Second car!
 *
 * @author chalk
 * @version 1.0.0
 * @since Mar 24, 2017
 */
public class Car2 {
	private String company, model, color;
	private int maxSpeed, price;
	
	public Car2(){
		// nothing to do
	}

	public Car2(String newCompany, String newModel, String newColor, int newMaxSpeed, int newPrice) {
		company = newCompany;
		model = newModel;
		color = newColor;
		maxSpeed = newMaxSpeed;
		price = newPrice;
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
