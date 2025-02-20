package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Customer;
import main.Movie;
import main.NewReleasePrice;
import main.RegularPrice;
import main.Rental;

import main.ChildrensPrice;


class CustomerTest {
	List<Object> movies = new ArrayList<>();
	
	@Test
	void BobStatementTest() {
		Customer cust1 = new Customer("bob");
		
	    Movie mov1;
	    Movie mov2;
	    
	    mov1 = new Movie("dumbo", new ChildrensPrice());
	    mov2 = new Movie("jaws", new RegularPrice());
	    
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
	void BobHTMLStatementTest() {
		Customer cust1 = new Customer("bob");
		
	    Movie mov1;
	    Movie mov2;
	    
	    mov1 = new Movie("dumbo", new ChildrensPrice());
	    mov2 = new Movie("jaws", new RegularPrice());
	    
	    Rental ren1;
	    Rental ren2;
		
	    ren1 = new Rental(mov1,2);
	    ren2 = new Rental(mov2,5);
	    
	    cust1.addRental(ren1);
	    cust1.addRental(ren2);
		
	    String expected = "<h1>Rental Record for bob</h1><p>dumbo<br>1.5</p><p>jaws<br>6.5</p><p>Amount owed is 8.0</p><p>You earned 2 frequent renter points</p>";
	    
		assertEquals(expected, cust1.htmlstatement());
	}
	
	@Test
	void AnnStatementTest() {
		Customer cust1 = new Customer("ann");
		
	    Movie mov3;
	    
	    mov3 = new Movie("ghost", new NewReleasePrice());
	    
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

	@Test
	void AnnHTMLStatementTest() {
		Customer cust1 = new Customer("ann");
		
		Movie mov3;
	    
	    mov3 = new Movie("ghost", new NewReleasePrice());
	    
	    Rental ren1;
	    Rental ren2;
		
	    ren1 = new Rental(mov3,1);
	    ren2 = new Rental(mov3,3);
	    
	    cust1.addRental(ren1);
	    cust1.addRental(ren2);
		
		String expected = "<h1>Rental Record for ann</h1><p>ghost<br>3.0</p><p>ghost<br>9.0</p><p>Amount owed is 12.0</p><p>You earned 3 frequent renter points</p>";
		
		assertEquals(expected, cust1.htmlstatement());
	}
}
