package mineSweeper;

public class CheckBombBoxes {
	
	
	// checks to see if the user input is B - Bomb returns nothing as I have an if check already handling this
		// if user input is not a bomb, count how many bombs are adjacent to that box and and store any Bombs found in numBoxNear
		// update the number in the grid to reflect numBoxNear
		// repeat process until box is touching a bomb

	public static void checkBoxes(char[][] grid, int row, int col) {
	    if (grid[row][col] == 'B') {
	        return;
	    }
	    
	    int numBoxNear = 0;
	    for (int i = row - 1; i <= row + 1; i++) {
	        for (int j = col - 1; j <= col + 1; j++) {
	            if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 'B') {
	                numBoxNear++;
	            }
	        }
	    }
	    grid[row][col] = (char) ('0' + numBoxNear);
	    if (numBoxNear == 0) {
	        for (int i = row - 1; i <= row + 1; i++) {
	            for (int j = col - 1; j <= col + 1; j++) {
	                if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == '?') {
	                    checkBoxes(grid, i, j);
	                }
	            }
	        }
	    }
	}
	
}
