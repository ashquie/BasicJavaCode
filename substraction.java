package math;

import java.util.Scanner;

class substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the 2 no. to substract");
		System.out.println("Enter the 1st no. ");
		Scanner one = new Scanner(System.in);
		int a = one.nextInt();
		System.out.println("Enter the 2nd no. ");
		Scanner two = new Scanner(System.in);
		int b = two.nextInt();
		int z = a - b;
		System.out.println("The Substraction of two no. is "+z);
		
		

	}

}
