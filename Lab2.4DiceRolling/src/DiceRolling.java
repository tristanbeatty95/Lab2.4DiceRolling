import java.util.Scanner;

public class DiceRolling {
	public static void main(String[] args) {

		System.out.println("Welcome to Tristan's Casino!");
		System.out.println("Hope you have a lot of cash on you!");
		System.out.println("How many sides should each die have?");

		Scanner scan = new Scanner(System.in);
		int dieSides = scan.nextInt();
		scan.nextLine();
		boolean cont = true;
		int dice1 = 0;
		int dice2 = 0;
		do {
			dice1 = (int) (Math.random() * dieSides + 1);
			dice2 = (int) (Math.random() * dieSides + 1);
			System.out.println(dice1);
			System.out.println(dice2);
			System.out.println("Would you like to continue? y/n");
			String cont2 = scan.nextLine();
			if (cont2.equals("n")) {
				cont = false;
			}
		} while (cont == true);

		System.out.println("Out of cash already? Come back again soon!");
	}
}
