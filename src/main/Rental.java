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
   
   public double getPrice() {
   	double price = 0;
   	switch (getMovie().getPriceCode()) {
       case Movie.REGULAR:
           price += 2;
           if (getDaysRented() > 2)
        	   price += (getDaysRented() - 2) * 1.5;
           break;
       case Movie.NEW_RELEASE:
       	price += getDaysRented() * 3;
           break;
       case Movie.CHILDRENS:
       	price += 1.5;
           if (getDaysRented() > 3)
        	   price += (getDaysRented() - 3) * 1.5;
           break;
   }
   	return price;
   }
   
   public int getFrequentRenterPoints() {
       // add bonus for a two day new release rental
       if ((getMovie().getPriceCode() == Movie.NEW_RELEASE) && 
       		getDaysRented() > 1) return 2;
	   // otherwise 1 point earned
	   return 1;
   }
}

