/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public class RegularPrice extends Price {
	int getPriceCode() {
		return 0;
	}
	
	double getPrice(int daysRented) {
		double price = 2;
		if (daysRented > 2) price += (daysRented - 2) * 1.5;
		return price;
	}
}
