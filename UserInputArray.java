package array;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int Number[]=new int[size];
		for(int i=0;i<size;i++) {
			Number[i]=sc.nextInt();
		}
		System.out.println("Enetr the No. You want to Search");
		int x=sc.nextInt();
		
		for(int i=0;i<Number.length;i++) {
			System.out.println(Number[i]);
		if(Number[i]==x) {
			System.out.println("X found at Index "+i);
		}
		if(Number[i]==x) {
			System.out.println("X found at Index "+i);
		}
		if(Number[i]==x) {
			System.out.println("X found at Index "+i);
		}
		}
		
	}

}
