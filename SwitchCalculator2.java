package math;

import java.util.Scanner;

public class SwitchCalculator2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int operator=sc.nextInt();
switch(operator){
case 1 :
{
	int sum = a+b;
System.out.println(sum);
}
break;
case 2 :
{
	int sub = a-b;
	System.out.println(sub);
}break;
case 3 :
{
int mull=a*b;
System.out.println(mull);
}break;
case 4 :
{
int	div=a/b;
System.out.println(div);
}break;
default :
{	
	System.out.println("Enter The no.");
}break;
}
	}

}
