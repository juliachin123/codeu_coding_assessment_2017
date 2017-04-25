
import java.util.*;
public class Stringa {
	
	public static Scanner s= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String b = s.nextLine();
		System.out.println(max(b));
	}
		public static char max(String b){
		char max=0;
		for (int i=0; i<b.length(); i++) {
			if (b.charAt(i)>max) {
				max=b.charAt(i);
			}
		}
		return max;
	}
		
	
		
}