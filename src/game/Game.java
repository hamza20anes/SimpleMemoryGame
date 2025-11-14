package game;
import java.util.Scanner;

public class Game {
	
	private Board board;
	private int attempts;
	
	public Game(int size) {
		board = new Board(size);
		attempts =0;
	}
	
	public void start() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("WELCOME TO MEMORY GAME!!");
		
		while(!board.allRevealed()) {
			board.displayBoard();
			
			System.out.println("Insert first card (row colum)");
			int r1 = scanner.nextInt();
			int c1 = scanner.nextInt();
			Card first = board.getCard(r1, c1);
			first.reveal();
			
			board.displayBoard();
			
			System.out.println("Insert secod card (row colum)");
			int r2 = scanner.nextInt();
			int c2 = scanner.nextInt();
			Card second = board.getCard(r2, c2);
			second.reveal();
			
			board.displayBoard();
			
			if(first.getSymbol().equals(second.getSymbol())) {
				System.out.println("GREATTT!!");
			}
			else {
				System.out.println("Nope!!");
				first.hide();
				second.hide();
			}
			
			attempts++;
			System.out.println("-------------------");
		}
		
		System.out.println("You won with "+ attempts +" attempts");
		scanner.close();
	}
}
