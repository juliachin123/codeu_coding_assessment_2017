import java.util.*;
public class Calculator {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String one= s.next();
		System.out.println(Calcu(one));
	}

	public static int Calcu(String one) {
		int x=0;
		x=one.charAt(0)-'0';
		char c= '+';
		char d= '*';
		char e= '/';
		char f= '-';
		char g= '^';
		for (int i=0; i<one.length(); i++) {
			int y;
			y=one.charAt(i+1)-'0';
			/*
			if (i==one.charAt(i)) {
				x=y;
			}
			*/
			if (i==c) {
				x+=y;
			}
			else if (i==d) {
				x*=y;
			}
			else if (i==e) {
				x/=y;
			}
			else if (i==f) {
				x-=y;
			}
			else if (i==g){
				Math.pow(x,y);
			}
			else {
				System.out.print("You typed an error!");
			}
		}
		return x;
	}
}

//whenever

//output+=charAt(i+1)