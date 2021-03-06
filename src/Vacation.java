
public class Vacation {
	protected int budget;
	protected String destination;
	
	public void Budget(int cost) {
		int difference = cost - budget;
		if (difference <= 0) {
			System.out.println("The vacation is $" + (difference * -1) + " under the budget.");
		}
		else {
			System.out.println("The vacation is $" + difference + " over the budget.");
		}
	}
	
	public void Budget(int [] cost) {
		int totalCost = 0;
		for(int i = 0; i < cost.length; i++) {
			totalCost += cost[i];
		}
		int difference = totalCost - budget;
		if (difference <= 0) {
			System.out.println("The vacation is $" + (difference * -1) + " under the budget.");
		}
		else {
			System.out.println("The vacation is $" + difference + " over the budget.");
		}
	}
	
	public String toString() {
		return "This is the Vacation class. The budget is " + budget + " and the destination is " + destination;
	}
}
