package array;

import java.util.Scanner;

public class StringDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Megha ";
String Lastname = "Hiremath";
String Fullname=name + Lastname;
Scanner sc=new Scanner(System.in);
String names=sc.next();
String nameis=sc.nextLine();
System.out.println("your name is "+names);
System.out.println("Your full name is "+nameis);
System.out.println("Your full name is "+name);
System.out.println("Your full name is "+Fullname);
System.out.println("Your full name is "+nameis.length());
//charAt
for(int i=0;i<Fullname.length();i++) {
	System.out.println(Fullname.charAt(i));
	
}

	}

}
