package firstproject;

public class functionOverloading{

//public static int sum(int a,int b){
//    int result=a+b;
//    return result;
//}
//public static double sum(double a,double b){
//    double result=a+b;
//    return result;
//}
//public static int sum(int a){
//    return a+1;
//}
//
//    public static void main(String args[]) {
//      int a=10;
//      int b=5;
//      System.out.println(sum(a));
//      System.out.println(sum(a,b));
//      System.out.println(sum(10.6,1.8));
//    }
	
	public static int sum(int a,int b)
	{
	    System.out.print("int sum ");
	    return a+b;
	}
	public static long sum(long a,long b)
	{
	    System.out.print("long sum ");
	    return a+b;
	}
	public static void main (String[] args) {
	        int a=4;
	        int b=5;
	    System.out.print(sum(a,b));
	}
	
	
	int S , E , W;
	S = s.nextInt();
	E = s.nextInt();
	W = s.nextInt();

 while(S<=E){
	 System.out.println(S + " "+((S-32)*5/9));
	 S=S+W;
 }
 //
 int basic_salary= s .nextInt();
	char grade= s.next().charAt(0);

	int allowance;
	if (grade=='A'){
		allowance =1700;
	}else if(grade =='B'){
		allowance = 1500;
	}else{
		allowance=1300;
	}
double total_salary = (basic_salary+(basic_salary * 0.20)+ (basic_salary * 0.50)+allowance) - (basic_salary*0.11);


double p = Math.round(total_salary);
int h = (int)(p);
System.out.println(h);



//
int N = s. nextInt();

int sum_even = 0;

int sum_odd = 0;

int temp = N;
int reminder =0;


while(temp!=0){
	reminder = temp%10;
	if(reminder%2==0){
		sum_even+=reminder;
	}else{
		sum_odd+=reminder;
	}
temp = temp/10;


}
System.out.println(sum_even + " " + sum_odd);


//     int n = s.nextInt();

int i =2;
while(i<n){
    if(n%i==0){
        System.out.print(i + " ");
     
    }
       i= i+1;

    
}


//
int x , n;

x = s.nextInt();
n= s. nextInt();
int i =0;
int multiply=1;
while(i<n){
multiply=multiply*x;
i++;
}  
System.out.println(multiply);


//

int i =1;
while(i<=N){
	int j =1;
	while(j<=i){
		System.out.print(i);
		j+=1;

	}
	System.out.println();
	i+=1;

}



//
while(i<=n){
    int j=1;
    while (j<=i){
        char jth =(char)('A'+c);
        System.out.print(jth);
        j=j+1;
       
    }
    System.out.println();
    i=i+1;
    c++;

}



//

int i = 1;
while (i <= N) {
	char start=(char)('A'-i+N);// int p = 'A'-i+N
	int j = 1;
	while (j <= i) {
		System.out.print(start);
		j += 1;
	start = (char) (start+1);// p=p+1
	}
	System.out.println();
	i += 1;
}


int i = 1;
while (i <= N) {
	char c = (char) ('A' + i - 1);
	int j = 1;
	while (j <= i) {
		System.out.print(c);
		j += 1;
	c = (char) (c + 1);
	}
	System.out.println();
	i += 1;
}

//half diamond

System.out.println("*");
for(int i = 1; i<=n; i++){
    System.out.print("*");
    for (int j =1; j<=i; j++){
        System.out.print(j);
    }
    for (int j =i-1; j>=1; j--){
        System.out.print(j);
    }
    System.out.print("*");
    System.out.println();
}
for(int i= n-1; i>=1; i--){
    System.out.print("*");
    for(int j = 1; j<=i; j++){
        System.out.print(j);
    }
    for(int j= i-1; j>=1; j--){
        System.out.print(j);
    }
    System.out.print("*");
    System.out.println();

}
System.out.print("*");


//parallelogram 

for(int currentRow =1; currentRow<=n; currentRow++){
	
	for (int spaces=1; spaces <=currentRow-1;spaces++){
		System.out.print(" ");
		}
	 for (int currColm= 1; currColm<=n; currColm++){
		 System.out.print("*");
	 }
	 System.out.println();
}
}

//integer sum
int row=1;
int sum=0;
while(row<=n){
	int col =1;
	while(col<=row){
		System.out.print(col);
		if(col==row){
			System.out.print("=");
		}else{
			System.out.print("+");
		}
		col = col + 1;
		
	}
	sum = (row*(row+1))/2;
	System.out.print(sum);

	System.out.println();
	row += 1;

	
	
}


//odd square


int row = 1;
while(row<=n){
	int value= (2* row) -1;
	int col =1;
	while(col<=n){
		// System.out.print(value);
		// value=value+2;
		int maxValue = (2*n)-1;
if(value<maxValue){
System.out.print(value);
value=value+2;
}
else if(value==maxValue){
System.out.print(value);
value=1;
}
else{
			System.out.print(value);
			value=value-2;
		}
		col = col +1;

	}
	System.out.println();
	row = row+1;

}

//sum series array

int[] num=new int[n]; 
//int prev=sc.nextInt();
for(int i=0;i<n;i++)
{
	num[i]=sc.nextInt();
}
boolean Ans=true;    
for(int j=0;j<n-2;j++)//j=index
{
	if(num[j]==num[j+1])
	{
		Ans=false;
		break;
	}
	if(num[j]<num[j+1]&&num[j+1]>num[j+2])
	{
		Ans=false;
		break;
	}       
}
	System.out.print(Ans);

}
}

//terms of AP
int x = s .nextInt();
int count = 0;
for( int n=1;count<x;n++){
	 int j = (3*n)+2;
	 if(j%4!=0){
		 System.out.print(j+" ");
		 count++;
	 }
}

//reverse a number
int ans =0;
while(n>0) {
	int rem = n%10;
	n = n/10;
	ans = ans*10 + rem;
}

System.out.print(ans);
}


//binary to decimal

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        
            Scanner s=new Scanner(System.in);
 
            String n=s.nextLine();
            
            System.out.println(Integer.parseInt(n,2));

	}
}

//decimal to binary

n = s.nextInt();

if(n==0){
    System.out.println(n);
    return;
}

    while(n > 0)
    {
        rem = n % 2;
        x = rem + "" + x;
        n = n / 2;
    }
System.out.println(x);
}


//square root

int i = 0;
while (i * i <= n) {

	i = i + 1;
}
i = i - 1;
System.out.println(i);

}	


//check number sequence
int n=sc.nextInt();
int[] num=new int[n]; 
//int prev=sc.nextInt();
for(int i=0;i<n;i++)
{
	num[i]=sc.nextInt();
}
boolean Ans=true;    
for(int j=0;j<n-2;j++)//j=index
{
	if(num[j]==num[j+1])
	{
		Ans=false;
		break;
	}
	if(num[j]<num[j+1]&&num[j+1]>num[j+2])
	{
		Ans=false;
		break;
	}       
}
	System.out.print(Ans);

	
	// farenhite to celsius
	
	 while(start<=end){
		 int F = 5*(start-32)/9;
		 System.out.println(start + " "+F );
		 start = start +step;
	 }
	 
	 
	 // fabonacci
	 
		int a =0;
		int b =1;
		int c;
		while(a<n){
			c=a+b;
			a=b;
			b=c;
		}	
		if (a==n){
			return true;
		}else{
			return false;
		}

}
    


