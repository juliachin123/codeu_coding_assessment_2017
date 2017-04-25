import java.util.*;
public class FindGCD {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int x = input.nextInt();
		System.out.print("Enter an integer: ");
		int y = input.nextInt();
		if( x< y){
			int z=x;
			x=y;
			y=z;
		}
		System.out.println("GCD = "+ gcd(x,y));
	}
	public static int gcd(int x, int y){
		if (y == 0){
			return x;
		}
		else{
			return gcd(y, x%y);
		}
	}
}