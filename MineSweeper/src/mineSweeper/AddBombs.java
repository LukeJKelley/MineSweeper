package mineSweeper;

import java.util.Random;

public class AddBombs {
	
	//	adds a specified amount of bombs to the grid
	
	public static void addBombsToGrid(int bombs, int rows, int columns, char[][] grid) {
		Random rand = new Random();
        for (int i = 0; i < bombs; i++) {
            int bombRow = rand.nextInt(rows);
            int bombCol = rand.nextInt(columns);
            grid[bombRow][bombCol] = 'B';
            
        }
	}

}
