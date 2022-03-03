package love;

import java.util.Scanner;

public class BeerSSong {
	public static void main(String[] args){
		System.out.println("Enter the num of beer you want to down ");
		Scanner beer=new Scanner(System.in);
		int beerNum=beer.nextInt();
		String word= "Bottles";
		while(beerNum>0){
		if(beerNum==1){
		word = "bottle";//singular bottle
		}
		
		System.out.println(beerNum +" " + word +" of beer on the wall");
		System.out.println(beerNum + " " + word + " of beer");
		System.out.println("Take one down.");
		System.out.println("Pass it around");
		beerNum= beerNum-1;
		if (beerNum>0){
		System.out.println(beerNum + " " +" of beer on the wall");
		}else{
		System.out.println("no more bottle of beer on the wall");
		}//end of else
		}//end while
		}//end of method

	

}
