package org.launchcode.class20.model;

/**
 * Class to represent a {@link Customer} order
 * 
 * @author Hank DeDona
 */
public class Order {

	private String orderId;
	private String description;
	
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
