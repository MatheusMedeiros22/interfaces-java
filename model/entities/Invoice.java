package model.entities;

public class Invoice {
	
	public Double basicPayment;
	public Double tax;
	
	public Invoice() {
		
	}
	
	
	public Double getTotalPayment() {
		return basicPayment + tax;
	}
}
