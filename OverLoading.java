package oops;
class Student {
	String name;
	int age;
	public void printinfo(String name){
		System.out.println(name);
		
	}
	public void printinfo(int age) {
		System.out.println(age);
	}
	public void printinfo(String name,int age) {
		System.out.println(name+" "+age);
	} 

}

public class OverLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student  s1=new  Student();
		Student s2=new Student();
		s1.name="aman";
		s2.name="kiki";
		s1.age=12;
		s2.age=23;
		s1.printinfo(s1.name,s1.age);
		s2.printinfo(s2.name);

	}

}