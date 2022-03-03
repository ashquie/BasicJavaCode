package array;

public class ArrayMarks {

	public static void main(String[] args) {
		int [] marks = new int[5];
		int age[]=new int[4];
		int love []= {22,23,24,25,};
		marks[0]=95;
		marks[1]=97;
		marks[3]=98;
		marks[2]=92;
		age[0]=92;
		age[1]=89;
		age[2]=22;
		age[3]=29;
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[1]);
		System.out.println(marks);
		for(int i=0;i<=4;i++) {
			System.out.println(marks[i]);
		System.out.println("age "+age[i]);
		}
	}

}
