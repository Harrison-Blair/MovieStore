/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

import java.util.* ;

public class Movie {

   private String _title;
   private Price _price;

   public Movie(String title, Price priceCode) {
      _title = title;
      setPriceCode(priceCode);
   }

   public int getPriceCode() {
      return _price.getPriceCode();
   }
   
   @Deprecated
   public int getFrequentRenterPoints(int daysRented) {
	   return _price.getFrequentRenterPoints(daysRented);
   }

   @Deprecated
   public double getPrice(int daysRented) {
	   	return _price.getPrice(daysRented);
	   }
   
   public void setPriceCode (Price price) {
      _price = price;
   }

   public String getTitle() {
      return _title;
   }
}

