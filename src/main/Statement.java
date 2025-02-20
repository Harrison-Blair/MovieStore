package main;

public abstract class Statement {
	public String makeStatement(Customer customer) {
		String result = headerString(customer);
        for (Rental rental: customer.getRentals()){
            //show figures for this rental
            result += eachRentalString(rental);
        }
        //add footer lines
        result += footerString(customer);
        return result;
	}
	
	public abstract String headerString(Customer customer);
	public abstract String eachRentalString(Rental rental);
	public abstract String footerString(Customer customer);
}
