import java.util.*;
public class Mult {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int sum=0;
		for (int i=1; i<n; i++) {
			if (i%15!=0) {
				if (i%3==0 || i%5==0) {
				sum+=i;
				}
			}
		}
		System.out.println(sum);
	}
}