/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public class NewReleasePrice extends Price {
	int getPriceCode() {
		return 1;
	}
	
	double getPrice(int daysRented) {
		return daysRented * 3;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2 : 1;
	}
}