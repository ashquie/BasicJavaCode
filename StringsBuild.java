package array;

public class StringsBuild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb = new StringBuilder("Tonny");
System.out.println(sb.charAt(0));

sb.setCharAt(0, 'p');
System.out.println(sb);
sb.insert(0, 'k');
System.out.println(sb);
sb.insert(3, 'n');
System.out.println(sb);
sb.delete(2, 4);
System.out.println(sb);
sb.append("l");
sb.append("l");
sb.append("f");
sb.append("u");
sb.append("c");
sb.append("k");
System.out.println(sb);
System.out.println(sb.length());
	}

}
