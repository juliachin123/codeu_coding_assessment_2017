import java.util.*;
public class PrimeFactors {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int count=0;
		for (int i=1; i<=n; i+=2) {
			if (n%i==0) {
			count+=1;
			}
		}
		System.out.println(count);
	}
}