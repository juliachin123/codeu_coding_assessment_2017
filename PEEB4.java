import java.util.*;
public class PEEB4{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		double emissivity = input.nextDouble();
		double constant = 5.67* Math.pow(10,-8);
		double s = 342;
		double alpha = 0.30;
		double first = 2*s*(1-alpha);
		double second = constant*(2-emissivity);
		double temp = Math.pow(((double) first/(double) second),0.25);
		System.out.println("Calculate surface temperature as a function of");
		System.out.println("emissivity for the single-layer atmosphere model.");
		System.out.println("enter emissivity: emissivity (= absorptivity) = " + emissivity);
		System.out.println("surface temperature = " + Math.round(temp) + "K");
	}
}