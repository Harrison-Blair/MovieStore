package main;

public abstract class Price {
	abstract int getPriceCode();
	
	abstract double getPrice(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
	   return 1;
   }
}
