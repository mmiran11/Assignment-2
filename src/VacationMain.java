import java.util.Scanner;
public class VacationMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] items = new String [3];
		int[] costs = new int [3];
		int budget, rating, price;
		String destination, brand, answer;
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
		System.out.println();
		System.out.print("Please enter PiecemealVacation's budget: ");
		budget = scan.nextInt();
		System.out.print("Please enter PiecemealVacation's destination: ");
		destination = scan.next();
		for(int i = 0; i < items.length; i++) {
			scan.nextLine();
			System.out.println("Please enter PiecemealVacation's items: ");
			items[i] = scan.nextLine();
			System.out.print("Please enter " + items[i] + " cost: ");
			costs[i] = scan.nextInt();
		}
//		boolean finished = false;
//		while(finished == false) {
//			int i = 0;
//			System.out.println("Please enter PiecemealVacation's items: ");
//			items[i] = scan.nextLine();
//			System.out.print("Please enter " + items[i] + " cost: ");
//			costs[i] = scan.nextInt();
//			System.out.print("Have you finished entering all items?: ");
//			answer = scan.next();
//			if(answer.equals("yes") || answer.equals("Yes")) {
//				finished = true;
//			}
//			else {
//				i = (i + 1) ;
//				finished = false;
//			}
//		}
		PiecemealVacation pieceV = new PiecemealVacation(budget, destination, items, costs);
		System.out.println();
		System.out.println(pieceV);
		System.out.println();
		pieceV.Budget(costs);
		
	}

}
