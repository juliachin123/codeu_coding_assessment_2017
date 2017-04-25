import java.util.*;
public class InputMax {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String n= s.nextLine();
		method(n);
	}
	public static void method( String n) {
		int word= Integer.parseInt(n.substring(0, 2));
		for (int i=1; i<n.length()-1; i++) {
			int x= Integer.parseInt(n.substring(i, i+2));
			if (x>word) {
				word=x;
			}	
		}
		System.out.println(word);
	}
}