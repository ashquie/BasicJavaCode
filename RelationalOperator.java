package operator;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
	//Get Bit
		//int n=5;
		//int pos=1;
		//int Bitmask=1<<pos;
		//if((Bitmask & n)==0) {
			//System.out.println("Bit was zero");
			
		//}else {
			//System.out.println("Bit was one");
		//}
	
	//Clear Bit
		//int n=5;
		//int pos=2;
		//int Bitmask=1<<pos;
		//int notBitmask=~(Bitmask);
		//int newnum= notBitmask & n;
		//{
			//System.out.println(newnum);
			
	      //}
	
	//Set Bit
		//int n=5;
		//int pos=2;
			//int Bitmask=1<<pos;
				//int newNumber=Bitmask | n;
				
				//System.out.println(newNumber);
				//if((Bitmask & n)==0) {
					//System.out.println("Bit was zero");
					
				//}else {
					//System.out.println("Bit was one");
			//	}
   //Update Bit
		Scanner sc=new Scanner(System.in);
		int oper=sc.nextInt();
		//oper=1 : set
		//oper=0 : clar
		int n=5;
		int pos=1;
		int bitmask=1<<pos;
		if(oper==1)
		{
			//set operatin(Update)
			
				int newNumber= bitmask | n;
				System.out.println(newNumber);
		}else {
			//clear(update)
			int newbitmask=~(bitmask);
			int newNumber = newbitmask & n;
             System.out.println(newNumber);			
		
		}
		
		
	}
	

}
