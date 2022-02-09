package math;

import java.util.Scanner;

public class multiplicascanner {

	public static void main(String[] args) {
		System.out.println("Enter the NO. you Want to multply");
		System.out.println("Enetr the First No.");
		Scanner one= new Scanner(System.in);
		int once=one.nextInt();
		System.out.println("Enetr the 2nd No. ");
		Scanner two= new Scanner(System.in);
		int twice= two.nextInt();
		int mull =once*twice;
		System.out.println("your multplication of 1st and 2nd no. is "+mull);
		
	}

}
