package math;

import java.util.Scanner;

public class PrintTableofNO {

	public static void main(String[] args) {
		System.out.println("Enetr The table you want to print");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<11;i++) {
			System.out.println(i*n);
			
		}
	}

}
