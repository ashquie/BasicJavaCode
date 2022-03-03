package love;

import java.util.Scanner;

public class BranchingIfandElse {
	public static void main(String[] args){
		System.out.println("enter the Number");
		Scanner newObject = new Scanner(System.in);
		int x = newObject.nextInt();
		System.out.println("your enter no. is "+x);
		
		if ( x==10){
		System.out.print("x must be 10");
		}
		else {
		if (x>3 ){
		System.out.print("Gently"+x );
		}else {
		System.out.print (" this program will Run no matter what");
	}
		}
	}}

