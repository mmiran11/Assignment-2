
public class PiecemealVacation extends Vacation {
	protected String[] items = {"Hotel", "Meals", "Flight"};
	protected int[] costs = {500, 300, 1000};

	public PiecemealVacation() {
		budget = 1000;
		destination = "Jamaica";
	}

}
