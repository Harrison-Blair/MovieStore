/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

public class ChildrensPrice extends Price {
	int getPriceCode() {
		return 2;
	}
	
	double getPrice(int daysRented) {
		double price = 1.5;
		if (daysRented > 3) price += (daysRented - 3) * 1.5;
		return price;
	}
}
