package math;

import java.util.Scanner;

public class Scznner {

	public static void main(String[] args) {
		System.out.println("Enter the name");
		Scanner Scan = new Scanner(System.in);
		String name = Scan.nextLine();
		String secname=Scan.nextLine();
		System.out.print(name+"\n"+secname);
	}

}
