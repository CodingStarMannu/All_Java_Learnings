package skillTests;
/* Check Armstrong
 * 
 * 
Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.
An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.
For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
Input Format :
Integer n
Output Format :
true or false
Sample Input 1 :
1
Sample Output 1 :
true
Sample Input 2 :
103
Sample Output 2 :
false*/


import java.util.Scanner;
import java.util.*;
public class CheckArmstrong {
	
	Scanner s=new Scanner(System.in);
    int N = s.nextInt();
    int count=0;
    int rem=0;
    int i;
      double power=0;
   int temp = N ;
    while(temp!=0)
    {

        temp=temp/10;
        count++;
    }

   int k=N;
    for(i=1;i<=count ;i++)
    {
        rem=k%10;
        power=power+Math.pow(rem,count);
        k=k/10;
    }
    if((int)power==N)
    {
        System.out.println("true");
    }
    else
        System.out.println("false");
}

}
