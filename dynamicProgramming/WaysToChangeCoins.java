package dynamicProgramming;

public class WaysToChangeCoins {
	
	//recursive
	private static int countWaysToMakeChangeRec(int[] denominations, int n, int value) {
	    if (value == 0) {
	        return 1;
	    }
	    if (value < 0 || n <= 0) {
	        return 0;
	    }
	    return countWaysToMakeChangeRec(denominations, n-1, value) + countWaysToMakeChangeRec(denominations, n, value-denominations[n-1]);
		}
	public static int countWaysToMakeChange(int denominations[], int value){
	        
			return countWaysToMakeChangeRec(denominations,denominations.length,value);
		}
	//Dynamic programming
	
	public static int countWaysToMakeChangeIt(int denominations[], int value){
        
		int n = denominations.length;
	    int[][] T = new int[n][value+1];
	    for (int j = 0; j <= value; j++) {
	        T[0][j] = j % denominations[0] == 0 ? 1 : 0;
	    }
	    for (int i = 1; i < n; i++) {
	        for (int j = 0; j <= value; j++) {
	            T[i][j] = T[i-1][j];
	            if (j >= denominations[i]) {
	                T[i][j] += T[i][j-denominations[i]];
	            }
	        }
	    }
	    return T[n-1][value];
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
