package skillTests;

/* Special Sum Of Array
 * 
 * Given an array of length N, which contains single digit elements at every index. You need to find and return the sum of all elements of the array. But the final sum should also be single digit.
In order to keep the output single digit - you need to keep adding the output number digits till single digit is left.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Single digit sum
Constraints :
1 <= N <= 10^6
Sample Input 1 :
3
9 9 9
Sample Output 1 :
9
Sample Output Explanation :
9 + 9 + 9 = 27
2 + 7 = 9
Hence, ans is 9.
Sample Input 2 :
5
1 7 8 5 9
Sample Output 1 :
3
Sample Output Explanation :
1 + 7 + 8 + 5 + 9 = 30
3 + 0 = 3
Hence, ans is 3.
 */

public class SpecialSumOfArray {
	
	
	public static int sum(int arr[]){
         int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        if(sum <10) return sum;
        int temp = sum;
        int singleDigitSum=0;
        while(true){
            while(temp>0){
                singleDigitSum += temp%10;
                temp=temp/10;
            }
            if(singleDigitSum<10){
                return singleDigitSum;
            }else{
                temp=singleDigitSum;
                singleDigitSum=0;
            }
            }
	}

}
