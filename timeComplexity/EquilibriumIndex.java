package timeComplexity;

public class EquilibriumIndex {
//	public static int equllibriumindex(int str[]) {
//		int totalSum=0;
//		int len = str.length;
//		int leftSum=0;
//		int rightSum =0;
//		int i =0;
//		while(i<len) {
//			totalSum= totalSum + str[i];
//			i++;
//		}
//		int index =0;
//		while(index<len) {
//			rightSum=totalSum-leftSum- str[index];
//			if (rightSum==leftSum) {
//				return index;
//			}
//			leftSum= leftSum +str[index];
//			i++;
//		}
//		return -1;
//	}
	
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        if ( arr.length==0 || k <= 0){
            return -1;
        }

        int sum , i =0;
        for (int i = 0; i < k; i++){
            sum = sum+ arr[i];

        }
        int maxSum = sum;
        int start =0;
        for (int j = i + 1; j < arr.length;j++) {

                sum += arr[j]-arr[start++];
            }
            if (sum > maxSum){
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
}
