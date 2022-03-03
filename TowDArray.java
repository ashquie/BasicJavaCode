package array;

import java.util.Scanner;

public class TowDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int rows=sc.nextInt();
int colm=sc.nextInt();
int[][] number=new int[rows][colm];
for(int i=0;i<rows;i++) {
	for(int j=0;j<colm;j++) {
		number[i][j]=sc.nextInt();
		
		
	}
	
	
}
int x =sc.nextInt();
for(int i=0;i<rows;i++) {
	for(int j=0;j<colm;j++) {
		System.out.print(number[i][j]+" ");
		if(number[i][j]==x) {
			System.out.println("X found at Index "+i+""+j);
		}
	}
	System.out.println();
}
	}

}
