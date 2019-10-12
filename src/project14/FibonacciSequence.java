package project14;

import java.util.Scanner;

public class FibonacciSequence {

	public static int Fibonaci(int N) {
		if (N == 0 || N == 1) {
			return N;
		} else {
			return Fibonaci(N - 1) + Fibonaci(N - 2);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: N = ");
		int N = Integer.parseInt(sc.nextLine());
		System.out.print("Output: ");
		for (int i = 0; i < N; i++) {
			if (Fibonaci(i) >= N)
				break;
			System.out.print(Fibonaci(i) + " ");
		}
		sc.close();
	}
}
