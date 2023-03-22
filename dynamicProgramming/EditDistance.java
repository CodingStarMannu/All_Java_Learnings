package dynamicProgramming;

public class EditDistance {
	
	//Brute Force approach
	public static int editDistance(String s, String t) {
		
		if(s.length() == 0 && t.length() ==0){
			return 0;
		}
		if(s.length()==0){
			return t.length();
		}
		if(t.length() ==0){
			return s.length();
		}
		if(s.charAt(0)== t.charAt(0)){
			return editDistance(s.substring(1), t.substring(1));
		}else{
			//insert
			int ans1 = editDistance(s, t.substring(1));

			//delete
			int ans2 = editDistance(s.substring(1), t);

			//substitute
			int ans3 = editDistance(s.substring(1), t.substring(1));

			return 1 + Math.min(ans1, Math.min(ans2, ans3));
		}
		
	}
	
	
	//Memoization
	
	public static int editDistanceMemo(String s, String t, int i, int j ,int[][]dp) {
		
		if(i==0 && j==0) {
			return 0;
		}
		if(i==0) {
			return j;
		}
		if(j==0) {
			return i;
		}
		
		if(dp[i][j] != -1) {
			return dp[i][j];
		}
		
		if(s.charAt(i-1) == t.charAt(j-1)) {
			dp[i][j] = editDistanceMemo(s,t,i-1,j-1,dp);
		}else {
			int insertDist = editDistanceMemo(s,t,i,j-1,dp);
			int deleteDist = editDistanceMemo(s,t,i-1,j,dp);
			int replaceDist = editDistanceMemo(s,t,i-1,j-1,dp);
			
			dp[i][j] = 1+ Math.min(insertDist, Math.min(deleteDist, replaceDist));
		}
		
		return dp[i][j];
		
		
	}
	
	
	
	public static int editDistanceIt(String s, String t) {
		
		int m = s.length();
		int n = t.length();

		int[][]dp =new int [m+1][n+1];

		for(int i =0; i<=m; i++){
			dp[i][0] = i;
		}
		for(int j =0; j<=n; j++){
			dp[0][j] = j;
		}

		for(int i =1; i<=m; i++){
			for(int j = 1; j<= n; j++){
				int ans;
				if(s.charAt(i-1) == t.charAt(j-1)){
					ans = dp[i-1][j-1];
					dp[i-1][j-1] = ans;
				}else{
					int ans1 = dp[i-1][j-1];
					int ans2 = dp[i][j-1];
					int ans3 = dp[i-1][j];
					ans =  1+ Math.min(ans1, Math.min(ans2, ans3));
				}
				dp[i][j] = ans;
				
			}
		}

		return dp[m][n];
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
