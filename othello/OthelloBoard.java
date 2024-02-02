package othello;

public class OthelloBoard {

	private int board[][];
	private int boardSize = 8;
	private int player1Symbol, player2Symbol;
	
	private int count;
	private static final int EMPTY = ' ';
	private static final int player1Wins =1;
	private static final int player2Wins =2;
	private static final int Draw =3;
	private static final int InvalidMove = 4;
	private static final int Incomplete =5;
	
	
	
	
	public OthelloBoard(int player1Symbol, int player2Symbol) {
		board = new int[boardSize][boardSize];
		for(int i =0 ; i< boardSize; i++) {
			for(int j =0; j< boardSize; j++) {
				board[i][j] = EMPTY;

			}
		}
		board[3][3] = player1Symbol;
		board[3][4] = player2Symbol;
		board[4][3] = player2Symbol;
		board[4][4] = player1Symbol;
		
		this.player1Symbol = player1Symbol;
		this.player2Symbol = player2Symbol;
	}
	
	
	public void print() {
		for(int i =0; i< boardSize; i++) {
			for(int j =0; j< boardSize ; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	int[] xDir = { -1,-1,0,1,1,1,0,-1};
	int[] yDir = { 0,1,1,1,0,-1,-1,-1};
	
	public boolean move(int symbol, int x , int y) {
		if(x < 0 || x >= boardSize || y < 0 || y >= boardSize) {
			return false;
		}
		
		boolean movePossible = false;
		
		for(int i =0 ; i < xDir.length; i++) {
			
			int xStep = xDir[i];
			int yStep = yDir[i];
			
			int currentX = x + xstep;
			int currentY = y + ystep;
		}
	}

}
