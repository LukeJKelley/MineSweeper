package mineSweeper;

public class CheckWin {

	public static int countElement(char[][] grid, char element) {
	    int count = 0;
	    for (char[] row : grid) {
	        for (char value : row) {
	            if (value == element) {
	                count++;
	            }
	        }
	    }
	    return count;
	}
	
}
