import java.util.*;
public class GreatestDeviation {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int lengtharray= s.nextInt();
		double[] numbers= new double[lengtharray];
		for (int i=0; i<numbers.length; i++){
			numbers[i]=s.nextInt();
		}
		addnum(numbers, lengtharray);
	}
	public static void addnum(double[] numbers, int lengtharray){
		int sum=0;
		double mean=0;
		double greatest=-1;
		int num=0;
		double deviation;
		double endnum=0;
		for (int i=0; i<numbers.length; i++){
			sum+=numbers[i];
		}
		mean= sum/lengtharray;
		for (int i=0; i<numbers.length; i++){
			deviation = Math.abs(numbers[i]-mean);
			if (deviation>greatest){
				greatest= deviation;
				endnum=numbers[i];
			}
		}
		System.out.println((int)endnum);
	}
}