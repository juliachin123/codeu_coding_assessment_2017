import java.util.*;
public class StandardDeviation {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Please enter the integer array dimension: ");
		int elementnumber=s.nextInt();
		double[] element= new double[elementnumber];
		System.out.println("Please enter the array elements: ");
		for (int i=0; i<element.length; i++){
			element[i]=s.nextInt();
		}
		double sum=0;
		double sum1=0;
		double mean=0;
		for (int i=0; i<element.length; i++){
			sum+=(double)element[i];
		}
		mean= sum/elementnumber;
		for (int i=0; i<element.length; i++){
			element[i]-=mean;
		}
		for (int i=0; i<element.length; i++){
			element[i]= Math.pow(element[i], 2);
		}
		for (int i=0; i<element.length; i++){
			sum1+=element[i];
		}
		double deviation= sum1/(elementnumber-1);
		double square_root= Math.sqrt(deviation);
		System.out.printf("Standard deviation = %.3f", square_root);
		System.out.println();
	}
}