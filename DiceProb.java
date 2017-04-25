import java.util.*;
public class DiceProb{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		double num= s.nextInt();
		System.out.print("Number of Rolls: ");
		double rolls= s.nextInt();
		dice(num, rolls);
	}
	public static void dice(double num, double rolls){
		double sum=0;	
		double success=0;
		for (double i=1; i<=rolls; i++) {	
			Random generator= new Random();
			double x= generator.nextInt(6)+1;
			double y=generator.nextInt(6)+1; 
			sum=x+y;
			if (sum==num) {	
				success+=1;	
			}
		}
		double prob= success/rolls;
		System.out.printf("Output of the probability = %.4f", prob);
		System.out.println();
	}
}