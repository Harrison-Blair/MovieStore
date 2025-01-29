package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Customer;
import main.Movie;
import main.Rental;

class CustomerTest {
	List<Object> movies = new ArrayList<>();
	
	@Test
	void BobStatementTest() {
		Customer cust1 = new Customer("bob");
		
	    Movie mov1;
	    Movie mov2;
	    
	    mov1 = new Movie("dumbo", 2);
	    mov2 = new Movie("jaws", 0);
	    
	    Rental ren1;
	    Rental ren2;
		
	    ren1 = new Rental(mov1,2);
	    ren2 = new Rental(mov2,5);
	    
	    cust1.addRental(ren1);
	    cust1.addRental(ren2);
		
	    String expected = "Rental Record for bob\n"
	    		+ "	dumbo	1.5\n"
	    		+ "	jaws	6.5\n"
	    		+ "Amount owed is 8.0\n"
	    		+ "You earned 2 frequent renter points";
	    
		assertEquals(expected, cust1.statement());
	}
	
	@Test
	void AnnStatementTest() {
		Customer cust1 = new Customer("ann");
		
	    Movie mov3;
	    
	    mov3 = new Movie("ghost", 1);
	    
	    Rental ren1;
	    Rental ren2;
		
	    ren1 = new Rental(mov3,1);
	    ren2 = new Rental(mov3,3);
	    
	    cust1.addRental(ren1);
	    cust1.addRental(ren2);
		
	    String expected = "Rental Record for ann\n"
	    		+ "	ghost	3.0\n"
	    		+ "	ghost	9.0\n"
	    		+ "Amount owed is 12.0\n"
	    		+ "You earned 3 frequent renter points";
	    
		assertEquals(expected, cust1.statement());
	}

}
