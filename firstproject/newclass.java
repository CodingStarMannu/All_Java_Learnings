package firstproject;
import java.util.Scanner;
public class newclass {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int[] arr=new int[n]; 
//		
//        int d = arr[1] - arr[0];
//        for (int i = 1; i < n; i++){
//            if (arr[i] - arr[i-1] != d){
//				System.out.println("false");
//			}else{
//				System.out.println("true");
//			}
//         }
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n;i++)

		{

		System.out.print("["+i+"]>>");

		a[i]=sc.nextInt();

		}

		for(int i=1;i<n;i++)

		{

		if(a[i-1]>a[i])

		{

		int temp=a[i-1];

		a[i-1]=a[i];

		a[i]=temp;

		i=0;

		}

		}

		int d=a[1]-a[0];

		boolean x=true;

		for(int i=1;i<n;i++)

		{

		int r=a[i]-a[i-1];

		x=(d==r)?true:false;

		}

		if(x==true)

		System.out.println("Given series are in AP");

		else

		System.out.println("Given series are not in AP");

		

	}

}
