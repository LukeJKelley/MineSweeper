package mineSweeper;

import java.util.Scanner;

public class UserInput {
	
	// Get User input for selection
	
	public static void getUserInput(int[] rowCol) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter row number: ");
        rowCol[0] = scanner.nextInt();
        System.out.print("Enter column number: ");
        rowCol[1] = scanner.nextInt();
    }
}
