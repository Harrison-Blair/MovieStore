/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public abstract class Price {
	abstract int getPriceCode();
	
	abstract double getPrice(int daysRented);
	
	public int getFrequentRenterPoints(int daysRented) {
	   return 1;
   }
}
