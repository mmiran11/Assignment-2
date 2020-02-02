
public class PiecemealVacation extends Vacation {
	protected String[] items = {"Hotel", "Meals", "Flight"};
	protected int[] costs = {500, 300, 1000};

	public PiecemealVacation() {
		budget = 1000;
		destination = "Jamaica";
	}
	
	public PiecemealVacation(int bud, String dest, String[] itms, int[] price) {
		budget = bud;
		destination = dest;
		for(int i = 0; i < itms.length; i++) {
			items[i] = itms[i];
			costs[i] = price[i];
		}
	}

	public @Override String toString() {
		return "This is the PiecemealVacation class. The budget is $" + budget + ", the destination is " + destination + ", the items needed are: a " + items[0] + " that costs $" + costs[0] + ", a " + items[1] + " that costs $" + costs[1] + ", and a " + items[2] + " that costs $" + costs[2]; 
	}
}
