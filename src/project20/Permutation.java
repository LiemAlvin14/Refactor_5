package project20;

import java.util.Scanner;

/**
 * @author CuongTV21
 *
 */
public class Permutation {
	//refactor
	private int[] scan(int N){
		int[] listNumber = new int[N];
		int temp1 = 0;

		for (int i = 0; i < N; i++) {
			System.out.print("Number #" + i + ": ");
			temp1 = Integer.parseInt(scanner.nextLine());
			listNumber[i] = temp1;
		}
		return listNumber;
	}
	
	//refactor
	private void showResult(int[] listNumber){
		System.out.print("The permutations of (");

		for (int i : listNumber) {
			if (i == listNumber[listNumber.length - 1])
				System.out.print(i);
			else
				System.out.print(i + ", ");
		}

		System.out.println(") are: " + permutations(N));
	}
	//refactor
	Permutation(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Total number N = ");
		int N = Integer.parseInt(scanner.nextLine());
		
		int[] listNumber = scan(N);

		showResult(listNumber)

		permutationNumber(listNumber, N);

		scanner.close();
	}

	public static void main(String[] args) {
		new Permutation();
	}
	
	//refactor
	public int swap(int a , int b){
		return b;
	}
	
	void permutationNumber(int[] listNumber, int N) {
		for (int j = 1; j <= N; j++) {
			for (int i = 0; i < listNumber.length - 1; i++) {
				listNumber[i] = swap(listNumber[i+1] = listNumber[i], listNumber[i+1]);
				show(listNumber);
			}
		}
	}

	void show(int[] listNumber) {
		System.out.print("(");
		for (int k : listNumber) {
			if (k == listNumber[listNumber.length - 1])
				System.out.print(k);
			else
				System.out.print(k + ", ");
		}
		System.out.print(")");
		System.out.println();
	}

	int permutations(int N) {
		if (N == 1)
			return N;
		return N * permutations(N - 1);
	}
}
