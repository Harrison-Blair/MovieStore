/* Written by Harrison Blair for Module-03-Assignment-1-Refactored Movie Store Project - Final Version */

package main;

import java.util.* ;

public class Rental {

   private Movie _movie;
   private int _daysRented;

   public Rental(Movie movie, int daysRented) {
      _movie = movie;
      _daysRented = daysRented;
   }
   
   public int getDaysRented() {
      return _daysRented;
   }

   public Movie getMovie() {
      return _movie;
   }
   
   @Deprecated
   public double getPrice() {
   	return _movie.getPrice(_daysRented);
   }
   
   @Deprecated
   public int getFrequentRenterPoints() {
       return _movie.getFrequentRenterPoints(_daysRented);
   }
}

