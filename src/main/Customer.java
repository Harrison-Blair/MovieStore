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
    
    private double getTotalCharge() {
    	double totalAmount = 0;
    	for (Rental rental: _rentals){
            totalAmount += rental.getPrice();
        }
    	return totalAmount;
    }
    
    private int getTotalFrequentRenterPoints() {
    	int totalFrequentRenterPoints = 0;
    	for (Rental rental: _rentals){
            totalFrequentRenterPoints += rental.getFrequentRenterPoints();
        }
    	return totalFrequentRenterPoints;
    }
    
    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental: _rentals){
            //show figures for this rental
            result += "\t" + rental.getMovie().getTitle()+ "\t" + 
               String.valueOf(rental.getPrice()) + "\n";
        }
        //add footer lines
        result +=  "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + 
                    " frequent renter points";
        return result;
    }
    
    public String htmlstatement() {
        String result = "<h1>Rental Record for " + getName() + "</h1>";
        for (Rental rental: _rentals){
            //show figures for this rental
            result += "<p>" + rental.getMovie().getTitle()+ "<br>" + 
               String.valueOf(rental.getPrice()) + "</p>";
        }
        //add footer lines
        result +=  "<p>Amount owed is " + String.valueOf(getTotalCharge()) + "</p>";
        result += "<p>You earned " + String.valueOf(getTotalFrequentRenterPoints()) + 
                    " frequent renter points</p>";
        return result;
    }
}


