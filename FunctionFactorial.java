package math;

import java.util.Scanner;

public class FunctionFactorial {

	public static void printFac(int n) {
		//looopp
		if (n<=0) {
			System.out.println("Invalid no.");
			return;
		}
		int fact=1;
		for (int i=n;i>=1;i--) {
			fact= fact*i;
			
		}
		System.out.println(fact);
	return;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
	printFac(n);	
		

	}

}
