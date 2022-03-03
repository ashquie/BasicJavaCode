package love;

public class Dog {
	public static void main(String[] args) {
		String[] pet = {" Nancy "," Browny "," Rocky "};
		int length = pet.length;
		int rand = (int) (Math.random() * length);
		String phrase = pet[rand];
		System.out.print( phrase + "is a dog.");
	
	}
}