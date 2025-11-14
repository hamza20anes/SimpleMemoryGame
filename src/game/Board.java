package game;

import java.util.ArrayList;
import java.util.Collections;

public class Board {
	private Card[][] grid;
	private int size;
	
	public Board(int size) {
		this.size = size;
		this.grid = new Card[size][size];
		initializeBoard();
	}
	
	private void initializeBoard() {
		
		ArrayList<String> symbols = new ArrayList<>();
		
		for (char c = 'A'; c < 'A' + (size * size) / 2; c++) {
            symbols.add(String.valueOf(c));
            symbols.add(String.valueOf(c));
        }
		
		Collections.shuffle(symbols);
		
		int index=0;
		for (int i=0;i<size;i++) {
			for (int j=0;j<size;j++) {
				grid[i][j]=new Card(symbols.get(index++));
			}
		}
		
	}
	
	public void displayBoard() {
        System.out.print("   ");
        for (int j = 0; j < size; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print(i + "  ");
            for (int j = 0; j < size; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
	
	public Card getCard(int row, int col) {
		return grid[row][col];
	}
	
	public boolean allRevealed() {
		for (int i = 0; i < size;i++) {
			for(int j = 0;j < size; j++) {
				if (!grid[i][j].isRevealed()) {
                    return false;
                }
			}
		}
		return true;
	}
	
}
