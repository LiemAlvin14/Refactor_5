package project11;

import java.util.Scanner;

public class MoneyManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your income this month: ");
		int income = Integer.parseInt(sc.nextLine());
		System.out.println("NEC: " + income * Acount.NEC / 100 + "\tLTSS: " + income * Acount.LTSS / 100);
		System.out.println("FFA: " + income * Acount.FFA / 100 + "\tPLAY: " + income * Acount.PLAY / 100);
		System.out.println("EDU: " + income * Acount.EDU / 100 + "\tGIVE: " + income * Acount.GIVE / 100);
		sc.close();
	}
}
