package love;

import java.util.Scanner;

public class MyFirstApp{
	public static void main(String[] args) {
		System.out.println("Enter the 2 no. you want to add");
		System.out.println("Enter the 1st No.");
		Scanner OutPut1 = new Scanner(System.in);
		int one = OutPut1.nextInt();
		System.out.println("Enter the 2nd No.");
		Scanner OutPut2 = new Scanner(System.in);
		int two = OutPut2.nextInt();
		int sum = one + two;
		System.out.println("Your 1ST Love name is  "+sum);

	
	}
}