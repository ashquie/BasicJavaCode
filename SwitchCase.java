package math;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the Button");
		int Button = sc.nextInt();
		
		
		//if(a==b) {
			//System.out.println("A and B both are equal");
		//}else if(a<=b) {
			//	System.out.println("A is less the B");
			//}else 
				//if (a>=b) {
					//System.out.println("A is greater then B");
					
			//	}

		switch(Button) {
		case 1 : System.out.println("Hello");
		break;
		case 2 : System.out.print("Namastey");
		break;
		case 3 : System.out.println("Banjor");
		break;
		default : System.out.println("Invalid Button");
		}

	}

}
