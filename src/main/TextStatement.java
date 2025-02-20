/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public class TextStatement extends Statement {
	public String headerString(Customer customer) {
		return "Rental Record for " + customer.getName() + "\n";
	}
	
	public String eachRentalString(Rental rental) {
		return "\t" + rental.getMovie().getTitle()+ "\t" + 
	               String.valueOf(rental.getPrice()) + "\n";
	}
	
	public String footerString(Customer customer) {
		return "Amount owed is " + String.valueOf(customer.getTotalCharge()) + "\n"
        	 + "You earned " + String.valueOf(customer.getTotalFrequentRenterPoints()) 
             + " frequent renter points";
	}
}
