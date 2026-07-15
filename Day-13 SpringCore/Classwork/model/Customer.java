package com.coforge.model;

import java.util.List;

public class Customer {
	private int customerId;
	private String customerName;
	private List<String> emails;
	private List<DeliveryAddress> deliveryAdress;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public List<String> getEmails() {
		return emails;
	}
	public void setEmails(List<String> emails) {
		this.emails = emails;
	}
	public List<DeliveryAddress> getDeliveryAdress() {
		return deliveryAdress;
	}
	public void setDeliveryAdress(List<DeliveryAddress> deliveryAdress) {
		this.deliveryAdress = deliveryAdress;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", emails=" + emails
				+ ", deliveryAdress=" + deliveryAdress + "]";
	}
	
	
	
	

}
