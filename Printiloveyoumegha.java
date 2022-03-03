package love;

import java.util.Scanner;

public class Printiloveyoumegha {

	public static void main(String[] args) {
		String word= "love me";
		System.out.println("Enter how many time megha have loved you? ");
		Scanner love=new Scanner(System.in);
		int loveno=love.nextInt();
		while(loveno>=0)
		{	
			word="loved me";
			if(loveno>=2&&loveno<=4) {
				word="love me again";
				System.out.println("megha "+word+"for "+loveno);
				loveno=loveno-1;
			}else	
			{
				if(loveno>=5&&loveno<=9) 
				{
					word="hate me";
					System.out.println("Megha "+word+ " for "+loveno+ " times");
					loveno=loveno-1;
				}else
		System.out.println("Megha have " +word+" for "+loveno+" times");
		loveno=loveno-1;
		
			}
		}
		}
		}
