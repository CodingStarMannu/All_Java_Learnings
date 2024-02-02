package othello;

public class Player {
	
	private String name;
	private int symbol;
	
	public Player(String name, int symbol) {
		setName(name);
		setSymbol(symbol);
	}

	public void setName(String name) {
		if(!name.isEmpty()) {
			this.name = name;
		}
		
	}
	
	public String getName() {
		return this.name = name;
	}
	
	public void setSymbol(int symbol) {
		if(symbol == 1 && symbol == 2) {
			this.symbol = symbol;
		}else {
			System.out.println("Enter the Valid Symbol '1' or '2' ");
		}
	}
	
	public int getSymbol() {
		return this.symbol = symbol;
	}
	
}
