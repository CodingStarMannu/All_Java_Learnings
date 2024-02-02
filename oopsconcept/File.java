package oopsconcept;

import java.util.Scanner;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();
		int[] Arr = new int[length];		
		
		for(int i =0; i<length;i++) {
			
			int input = s.nextInt();
			Arr[i] = input;
			
		}
		
		System.out.print(Arr);

	}

}
