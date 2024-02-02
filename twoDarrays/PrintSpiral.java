package twoDarrays;

public class PrintSpiral {
	public static void spiralPrint(int matrix[][]){
		int n = matrix.length;
		int m=matrix[0].length;
		int cS , rS =0,  cE=n, rE =m;
		int i =0;
		while(rS<n){
			System.out.println(rS);
			rS=rS+1;

		}
		while (cE <rE) {
			System.out.println(cE);
			cE = cE - 1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix [][]= new int[4][4];
		spiralPrint(matrix);
	}

}
