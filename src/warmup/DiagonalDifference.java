package warmup;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		long[][] numbers = readNumsFromCommandLine();
		long primaryDiagonal = 0;
		int primaryRow = 0 ; 
		int primaryCol = 0 ;
		long secondaryDiagonal = 0 ;
		int secondaryRow = 0 ; 
		int secondaryCol = numbers.length -1 ; 
		for (int i = 0; i < numbers.length; i++) {
			primaryDiagonal += numbers[primaryRow][primaryCol];
			primaryRow++; primaryCol++; 
			secondaryDiagonal += numbers[secondaryRow][secondaryCol]; 
			secondaryRow++; secondaryCol--; 
		}
		long result = primaryDiagonal - secondaryDiagonal ;
		System.out.println(Math.abs(result));

	}

	public static long[][] readNumsFromCommandLine() {

		Scanner s = new Scanner(System.in);

		int count = s.nextInt();
		s.nextLine(); // throw away the newline.

		long[][] numbers = new long[count][count];
		for (int i = 0; i < count; i++) {
			Scanner numScanner = new Scanner(s.nextLine());
			for (int j = 0; j < count; j++) {
				if (numScanner.hasNextInt()) {
					numbers[i][j] = numScanner.nextInt();
				} else {
					System.out.println("You didn't provide enough numbers");
					break;
				}
			}
		}

		return numbers;
	}

	private static void printArray(long[][] numbers) {

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.println(numbers[i][j]);
			}
		}
	}

}
