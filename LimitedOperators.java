import java.util.Scanner;
public class LimitedOperators {
	public static void main(String[] args){
		System.out.println("Enter two integers to be added:");
		Scanner console= new Scanner(System.in);
		int a1= console.nextInt();
		int a2= console.nextInt();
		System.out.println("The sum is " + add(a1, a2));
		System.out.println("The difference is " + subtract(a1, a2));
		System.out.println("The quotient is " + quotient(a1,a2));
		System.out.println("The remainder is " + remainder(a1,a2));
	}
	public static int add(int x, int y) {
		int one=0;
		for (int i=1; i<=x; i++) {
			one++;
		}
		for (int i=1; i<=y; i++) {
			one++;
		}
		return one;
	}
	public static int subtract(int x, int y) {
		int one =0;
		for (int i=1; i<=x; i++) {
			one++;
		}
		for (int i=1; i<=y;i++) {
			one--;
		}
		return one;
	}
	public static int quotient(int x, int y) {
		int one=0;
		while (x>y) {			
			x= subtract(x,y);
			one++;
			}
		if (x==y) {
			one++;
		}
			return one;
	}
		public static int remainder(int x, int y){
			int one =0;
			while (x>y) {
				x= subtract(x,y);
				one++;
			}	
			if (x==y) {
				x=0;
			}
			return x;
	}		
}