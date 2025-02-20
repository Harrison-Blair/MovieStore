/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public class HtmlStatement extends Statement{
	public String headerString(Customer customer) {
		return "<h1>Rental Record for " + customer.getName() + "</h1>";
	}
	
	public String eachRentalString(Rental rental) {
		return "<p>" + rental.getMovie().getTitle()+ "<br>" + 
	               String.valueOf(rental.getPrice()) + "</p>";
	}
	
	public String footerString(Customer customer) {
		return "<p>Amount owed is " + String.valueOf(customer.getTotalCharge()) + "</p>"
			 + "<p>You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) 
             + " frequent renter points</p>";
	}
}
