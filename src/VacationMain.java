import java.util.Scanner;
public class VacationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] items = new int [3];
		int[] costs = new int [3];
		int budget, rating, price;
		String destination, brand, calculation;
		System.out.print("Please enter All-InclusiveVacation's budget: ");
		budget = scan.nextInt();
		System.out.print("Please enter All-InclusiveVacation's destination: ");
		destination = scan.next();
		System.out.print("Please enter All-InclusiveVacation's brand: ");
		brand = scan.next();
		System.out.print("Please enter All-InclusiveVacation's rating: ");
		rating = scan.nextInt();
		System.out.print("Please enter All-InclusiveVacation's price: ");
		price = scan.nextInt();
		All_InclusiveVacation allV = new All_InclusiveVacation(budget, destination, brand, rating, price);
		System.out.println();
		System.out.println(allV);
		System.out.println();
		allV.Budget(price);
	}

}
