package math;

import java.util.Scanner;

public class ConditionalMsg {

	public static void main(String[] args) {
		System.out.println("Eneter no. to Cheak even or odd");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%2==0) {
			System.out.println("This no. is even No.");
		}else {
			System.out.println("This no. is Odd no.");
		}
		

	}

}
