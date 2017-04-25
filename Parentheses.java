import java.util.*;
public class Parentheses {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your string below:");
		String s= scan.next();
		parentheses(s);
	}
	public static void parentheses(String s) {
		int count_begin=0;
		int count_end=0;
		int depth_max=0;
		int depth_begin=0;
		int depth_end=0;
		boolean s_fail= false;
		for (int i=0; i<s.length();i++) {
				if (s.charAt(i)=='(') {
					count_begin+=1;
		//			depth_begin+=1;
	                if (depth_max>0) {	
					   depth_max-=1;
					}
				}
				if (s.charAt(i)==')') {
					count_end+=1;
		//			depth_end+=1;
				}
			//	if (s.charAt(i)=='(' && (depth_begin-1)>depth_end) {
			//		depth_begin-=depth_end;
			//		if (depth_begin > depth_max) {
            //        depth_max-=depth_begin;

			//	}
				if (count_end>count_begin) {
					s_fail=true;
					break;
				}
				else if (count_begin>0 && count_end==1) {
					depth_max+=1;
					count_begin-=1;
					count_end-=1;
				}
		}
		if (s_fail==true || count_begin>0) {
			System.out.println("false");
		}
		else if(depth_max>0) {
			System.out.println("true");
			System.out.println(depth_max);
		}	
	}
}