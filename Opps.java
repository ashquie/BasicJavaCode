package oops;


//class Student{
	String name;
	int age;
	String Classes;
	int subject;
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.Classes);
		System.out.println(this.subject);
		
	}
	//non paratermise constructor
	Student(String classes,int subject){
		this.Classes=classes;
		this.subject=subject;	
		
		}
	//paratermise constructor
		//Student(){
			//System.out.println("Constructor called");	
			//}
	
		}

class pen{
	String colour;
	String type; //ballpoint;Gell
	
	public void write() {
		System.out.println("Writing Somthing");
	}
	

public void printColour() {
	System.out.println(this.colour);
}
}




public class Opps {

	public static void main(String[] args) {
//pen
		pen pen1 = new pen();
		pen1.colour = "blue";
		pen1.type = "Gell";

		pen pen2=new pen();
		pen2.colour="black";
		pen2.type ="ball";
		pen1.write();
		pen1.printColour();
		pen2.printColour();
//Student
 
		
		Student Student1=new Student("two",4);
		Student Student2=new Student("four",5);
		Student1.name="Megha";
		Student2.name="Vivek";
		Student1.age=29;
		Student2.age=30;
		Student1.printinfo();
		Student2.printinfo();
	}

}
