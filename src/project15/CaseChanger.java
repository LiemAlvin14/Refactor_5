package project15;

import java.util.Scanner;

public class CaseChanger {

	public static void main(String[] args) {
		Functions functions = new Functions();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input: ");
		String sentence = scanner.nextLine();
		System.out.println("Upper case:\n" + functions.allUpperCase(sentence));
		System.out.println("Lower case:\n" + functions.allLowerCase(sentence));
		System.out.println("Capitalize:\n" + functions.capitalize(sentence));
		System.out.println("Sentence case:\n" + functions.sentenceCase(sentence));
		System.out.println("Invert case:\n" + functions.invert(sentence));
		scanner.close();
	}
}
