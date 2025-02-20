/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

import java.util.* ;

public class Customer {

    private String _name;
    private ArrayList<Rental> _rentals = new ArrayList<Rental>();

    public Customer(String name) {
       _name = name;
    }

    public void addRental(Rental arg) {
       _rentals.add(arg);
    }

    public String getName() {
       return _name;
    }
    
    double getTotalCharge() {
    	double totalAmount = 0;
    	for (Rental rental: _rentals){
            totalAmount += rental.getPrice();
        }
    	return totalAmount;
    }
    
     int getTotalFrequentRenterPoints() {
    	int totalFrequentRenterPoints = 0;
    	for (Rental rental: _rentals){
            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
        }
    	return totalFrequentRenterPoints;
    }
    
    public String statement() {
        return new TextStatement().makeStatement(this);
    }
    
    public String htmlstatement() {
        return new HtmlStatement().makeStatement(this);
    }

	public ArrayList<Rental> getRentals() {
		return _rentals;
	}
}


