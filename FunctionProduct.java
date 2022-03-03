package math;

import java.util.Scanner;

public class FunctionProduct {

	public static int callAdd(int a,int b) {
		//int sum=a*b;
		return a*b;
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1St no.");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd no.");
		int b=sc.nextInt();
	//int sum=callAdd(a,b);
	
	System.out.println("Product of "+a+" and "+b+" is : "+callAdd(a,b));
	}}
