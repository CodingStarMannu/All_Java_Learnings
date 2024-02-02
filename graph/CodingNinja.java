package graph;

public class CodingNinja {
	int solve(String[] Graph , int N, int M)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		char[][] matrix=new char[N+1][M+1];
        boolean[][] visited=new boolean[N+1][M+1];
		for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                matrix[i][j]=Graph[i].charAt(j);
            }
        }
		for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j]=='C'){
                    if(helper(matrix, i, j, N , M, visited, 0)){return 1;}
                }
            }
        }
        return 0; 
		
	}
    public static boolean helper(char[][]matrix , int i, int j, int N, int M, boolean[][] visited, int count){
        if(count==1 && matrix[i][j]!='O'){return false;}
        if(count==2 && matrix[i][j]!='D'){return false;}
        if(count==3 && matrix[i][j]!='I'){return false;}
        if(count==4 && matrix[i][j]!='N'){return false;}
        if(count==5 && matrix[i][j]!='G'){return false;}
        if(count==6 && matrix[i][j]!='N'){return false;}
        if(count==7 && matrix[i][j]!='I'){return false;}
        if(count==8 && matrix[i][j]!='N'){return false;}
        if(count==9 && matrix[i][j]!='J'){return false;}
        if(count==10 ){
            if(matrix[i][j]=='A'){
                visited[i][j]=true;
                return true;
            }
            return false;
        }
        boolean res=false;
        if(i>0 && matrix[i-1][j]!='X' && visited[i-1][j]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i-1, j ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        if(j>0 && matrix[i][j-1]!='X' && visited[i][j-1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i, j-1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        if(i>0 && j>0 && matrix[i-1][j-1]!='X' && visited[i-1][j-1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i-1, j-1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        if(i>0 && j<M-1 && matrix[i-1][j+1]!='X' && visited[i-1][j+1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i-1, j+1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
         if(j<M-1 && matrix[i][j+1]!='X' && visited[i][j+1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i, j+1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        if(i<N-1 && j>0 && matrix[i+1][j-1]!='X' && visited[i+1][j-1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i+1, j-1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        if(i<N-1 && matrix[i+1][j]!='X' && visited[i+1][j]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i+1, j ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
         if(i<N-1 && j<M-1 && matrix[i+1][j+1]!='X' && visited[i+1][j+1]==false){
            visited[i][j]=true;
            boolean ans=helper(matrix, i+1, j+1 ,N, M, visited, count+1);
            if(ans==true){return true;}
            visited[i][j]=false;
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
