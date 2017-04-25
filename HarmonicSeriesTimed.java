import java.util.*;
public class HarmonicSeriesTimed {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double num=s.nextDouble();
		final long startTime = System.currentTimeMillis();		
		int count = harmonic(num); 			
		final long endTime = System.currentTimeMillis();
		System.out.println("Total execution time: " + (endTime - startTime) );
		System.out.printf("Time per term: %.5f", (double)(endTime-startTime)/count);
		System.out.println();
		}
	public static int harmonic(double num){
		double sum=0;
		int count=1;
		if (num<1){
			System.out.print("");
		}
		while(sum<=num){
			sum += (double)(1.0/count);
			count++;
		}
		count--;
		System.out.print("Actual sum = ");	
		System.out.printf("%.5f", sum);
		System.out.println();
		System.out.println("Number of terms required: "+count);
		return count;
		}
}