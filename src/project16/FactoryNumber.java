package project16;

import java.util.Scanner;

import project13.NumbersToWords;

public class FactoryNumber {

	public static int calculate(int N) {
		if (N == 1)
			return N;
		return N * calculate(N - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input:\nN = ");
		int N = Integer.parseInt(sc.nextLine());
		System.out.println("Output:\n" + N + "! = " + FactoryNumber.calculate(N) + "("
				+ NumbersToWords.convert(FactoryNumber.calculate(N)) + ")");
		sc.close();
	}
}
