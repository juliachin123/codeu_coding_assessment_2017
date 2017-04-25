import java.util.*;
public class HarmonicSeries {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double num=s.nextDouble();
		double sum=0;
		int count=1;
		while(sum<=num){
			sum += (double)(1.0/count);
			count++;
		}
		count-=1;
		System.out.print("Actual sum = ");	
		System.out.printf("%.5f", sum);
		System.out.println();
		System.out.println("Number of terms required: "+count);	
	}
}