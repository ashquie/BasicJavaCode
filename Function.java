package math;

import java.util.Scanner;

public class Function {

	public static void printMyName(String name )
	{
		System.out.print(name);
		return;
		
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	String name=sc.nextLine();
	printMyName(name);
	
	}

}
