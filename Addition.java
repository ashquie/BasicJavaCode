package math;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("Enter the NO. you Want to Add ");
		System.out.println("enter the 1st no.");
		Scanner one= new Scanner(System.in);
		int y = one.nextInt();
		System.out.println("Enter the 2nd no. ");
		Scanner two = new Scanner(System.in);
		int z = two.nextInt();
		int sum = y+z;
		System.out.println("The Sum of two Different No. is " + sum);
   
		

	}

}
