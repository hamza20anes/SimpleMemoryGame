package game;

public class Card {
	private String symbol;
	private boolean revealed;
	
	public Card(String symbol) {
		this.symbol = symbol;
		this.revealed = false;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public boolean isRevealed() {
		return revealed;
	}
	
	public void reveal() {
		revealed = true;
	}
	
	public void hide() {
		revealed = false;
	}
	
	@Override
	public String toString() {
		return revealed ? symbol : "+";
	}
}
