import java.util.*;
public class GCD {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter positive integer a:     ");
		int one= s.nextInt();
		System.out.println("Enter positive integer b < a: ");
		int two= s.nextInt();
		if (one<0 || two<0) {
			one= Math.abs(one);
		}	
		//System.out.println("GCD(a,b)= GCD ("+two+"," + one%two+")");	
		int num=0;
		while(two != 0) {
                num = one % two;
                one = two;
                two = num;
            }
		System.out.println("Greatest common divisor (GCD) = "+ one);
	}
}
	/*GCD(a,b)= GCD (b, a%b)
		GCD (a,o)= ABSOLUTE VALUE of a
		GCD (270,192)= (192,78)
			(78, 36)	(36,6)
			(6,0)	->	6
		while(6!=0)	*/