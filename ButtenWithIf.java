package math;

import java.util.Scanner;

public class ButtenWithIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Button.");
		int Button = sc.nextInt();
		
		
		if(Button==1) {
			System.out.println("Hello");
		}else if(Button==2) {
				System.out.println("Namastey");
			}else 
				if (Button==3) {
					System.out.println("Bonjure");
					
				}else {
					System.out.println("invalid Button");
				}
			}
}
