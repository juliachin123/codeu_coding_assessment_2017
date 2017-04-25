import java.util.*;
public class LongestName {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		longestName(s, n);
	}
	public static void longestName(Scanner s, int n) {
		String c= " ";
		int b=0;
		for (int i=1; i<=n; i++) {
			System.out.println("name #"+i+"?");
			String a=s.next();
			if (a.length()>=b) {
				c=a;
				b=a.length();
			}
		}
		System.out.println(c+"'s name is the longest");
	}
}
