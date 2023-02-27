package mineSweeper;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		PrintMineSweeper printTitle = new PrintMineSweeper();
		GameBoard gameBoard = new GameBoard();
		CheckBombBoxes checkBombs = new CheckBombBoxes();
		UserInput userInput = new UserInput();
		AddBombs addBombs = new AddBombs();
		CheckWin checkWin = new CheckWin();

		
		System.out.println("Welcome to : ");
		printTitle.printMineSweeper();
		
		System.out.println();

		
		// Variables for rows & columns of grid
		// Number of bombs on bombs
        int rows = 10;
        int columns = 10;
        int bombs = 10;
        
        
        // Create 2D array filled with '?'
        char[][] grid = new char[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                grid[i][j] = '?';
            }
        }
        
        
        // Randomly adds bombs to grid (2d array)
        // Bombs equal B
        addBombs.addBombsToGrid(bombs, rows, columns, grid);
        
        
        // display grid for start of game       
        gameBoard.printGrid(grid);
        
        
        //continue the loop until user hits 10
        while(true) {
        
        	
        //User input store row and column for selection in 2d array
        System.out.println();
        int[] rowCol = new int[2];
        UserInput.getUserInput(rowCol);
        int row = rowCol[0];
        int col = rowCol[1];
        System.out.println();
        
        // check if user selects B on 2d array grid
        // break out of game and print boom
        // if else box has zero -> box has already been cleared
        
        if(grid[row][col] == 'B') {
        	gameBoard.printGrid(grid);
        	System.out.println();
        	System.out.println("boom!");
        	break;
        } else if (grid[row][col] != '?') {
        	gameBoard.printGrid(grid);
        	System.out.println();
        	System.out.println("This box is already clear");
        	continue;
        }
       
        //updates the elements in the grid with the number of adjacent bombs
        //if 0 continue printing until not 0
        checkBombs.checkBoxes(grid, row, col);

        // Print grid with user selection and bomb boxes
        gameBoard.printGrid(grid);
        
         if (checkWin.countElement(grid, '?') == 0) {
        	 System.out.println();
        	 System.out.println("You win!!");
        	GameBoard.printGrid(grid);
        	System.out.println();
        	System.out.println("You win!!");
        	break;
        } else {
        	System.out.println();
        	System.out.println(checkWin.countElement(grid, '?') +" boxes left to clear");
        }
    
    }
        
        
	}

}

