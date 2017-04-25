import java.util.*;
public class Fencepost {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String one= s.next();
		for (int i=0; i<one.length(); i++) {
			if (i==one.length()-1) {
				System.out.print(one.charAt(i));
			}
			else {
			System.out.print(one.charAt(i)+"..");
			}
		}
		System.out.println();
	}
}