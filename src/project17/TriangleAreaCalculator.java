package project17;

import java.util.Scanner;

/**
 * The Class TriangleAreaCalculator.
 */
public class TriangleAreaCalculator {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("The numbers are separated by a space for points !");
		System.out.print("Enter Point A (x, y):\t");
		String pointA = scanner.nextLine();
		System.out.print("Enter Point B(x, y):\t");
		String pointB = scanner.nextLine();
		System.out.print("Enter Point C(x, y):\t");
		String pointC = scanner.nextLine();

		String[] temp1 = pointA.split("\\s+");
		String[] temp2 = pointB.split("\\s+");
		String[] temp3 = pointC.split("\\s+");

		int xA = Integer.parseInt(temp1[0]);
		int yA = Integer.parseInt(temp1[1]);

		int xB = Integer.parseInt(temp2[0]);
		int yB = Integer.parseInt(temp2[1]);

		int xC = Integer.parseInt(temp3[0]);
		int yC = Integer.parseInt(temp3[1]);

		double length_AB = Math.sqrt(Math.pow(Math.abs(xA - xB), 2) + Math.pow(Math.abs(yA - yB), 2));
		double length_BC = Math.sqrt(Math.pow(Math.abs(xB - xC), 2) + Math.pow(Math.abs(yB - yC), 2));
		double length_AC = Math.sqrt(Math.pow(Math.abs(xA - xC), 2) + Math.pow(Math.abs(yA - yC), 2));

		double p = (length_AB + length_BC + length_AC) / 2;

		System.out.print("Area = " + Math.sqrt(p * (p - length_AB) * (p - length_BC) * (p - length_AC)));
		scanner.close();
	}

}
