import java.util.*;
public class EvenSumMax {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		evenSumMax(s);	
	}
	public static void evenSumMax(Scanner s){
		System.out.println("How many integers?");
		int one=s.nextInt();
		int sum=0;
		int max=0;
		for (int i=1; i<=one; i++) {
			System.out.println("Next integer?");
			int next=s.nextInt();
			if (next%2==0) {	
				sum+=next;
				if (next>max) {
					max=next;
					}
			}
		}	
		System.out.println("Even sum= "+ sum+" Even max= "+max);
	}
}