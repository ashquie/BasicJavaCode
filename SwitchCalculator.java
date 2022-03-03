package math;

import java.util.Scanner;

public class SwitchCalculator {

	public static void main(String[] args) {
		System.out.println("For \nadd Enetr 1\nSubstraction Enter 4\nMultiplication Enter 2\nDivision Enetr 3");
		Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the Button");
	
	int Button = sc.nextInt();

	switch(Button) {
	case 1 :
		{
			System.out.println("This is Addition");
			Scanner x = new Scanner(System.in);
			System.out.println("Enter 1st no.");
			int one= x.nextInt();
			System.out.println("Enter 2nd no.");
		int Two = x.nextInt();
				int add= one + Two;
		System.out.println("The Addition of "+one+ " and "+Two+" is "+add+"\nIts addition");
		}
	break;
	case 2 :
	{
		System.out.println("This is Multiplication");
		Scanner y = new Scanner(System.in);
		System.out.println("Enter !st no.");
		int one = y.nextInt();
		System.out.println("Enter 2nd no.");
		int Two = y.nextInt();
		int mull = one*Two;
   	System.out.println("Multiplication of "+one+" and " +Two+ " is " +mull+"\nIts multiplication");
	}
		break;
	case 3 :
	{
		System.out.println("This is Division");
		Scanner z = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int one = z.nextInt();
		System.out.println("Enter 2nd no.");
	int two = z.nextInt();
	int div = one/two;
	int Mod = one%two;
		System.out.println("Division of "+one+" and " +two+" is " +div+"\nIts division and Remender is "+Mod);
	}	
	break;

	case 4 :
	{
		System.out.println("This is Division");
		Scanner z = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		int one = z.nextInt();
		System.out.println("Enter 2nd no.");
	int two = z.nextInt();
	int sub = one-two; 
		System.out.println("Substraction of " +one+" and " +two+ " is "+sub+"\nIts Substraction");
	}	
	break;
	default : System.out.println("Invalid Button");
	}



	}

}
