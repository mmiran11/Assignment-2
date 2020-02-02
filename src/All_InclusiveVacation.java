
public class All_InclusiveVacation extends Vacation {
	protected String brand;
	protected int rating,  price;

	public All_InclusiveVacation() {
		budget = 1000;
		destination = "Hawaii";
		brand = "Hilton Resorts";
		rating = 3;
		price = 1000;
	}
	
	public All_InclusiveVacation(int bud, String dest, String brd, int rate, int prc) {
		budget = bud;
		destination = dest;
		brand = brd;
		rating = rate;
		price = prc;
	}
	
	public @Override String toString() {
		return "This is the All-InclusiveVacation class. The budget is " + budget + ", the destination is " + destination + ", the brand is " + brand + ", the rating is " + rating + ", and the price is " + price; 
	}

}
