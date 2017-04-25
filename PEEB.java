import java.util.*;
import java.text.DecimalFormat;
public class PEEB {
	public static void main(String[] args){
		System.out.println("Calculate radiant photon flux at a given wavelength");
		System.out.println("and temperature using Planck's Law");
		Scanner input= new Scanner(System.in);
		System.out.print("wavelength in microns: ");
		double wavelength= input.nextInt();
		System.out.print("temperature in degrees Kelvin: ");
		double temp= input.nextInt();
		wavelength=wavelength*1e-6;
		double h= 6.626068E-34;
		double c= 299792500;
		double k=1.38066E-23;
		double dexp= (h*c)/(wavelength*k*temp);
		double d= Math.exp(dexp)-1;
		double n= 2*h*Math.pow(c,2)*Math.pow(wavelength,-5);
		double b= n/d;
		DecimalFormat df1 = new DecimalFormat("0.00E00");
		System.out.println("radiant flux B = " + df1.format(b).toLowerCase());
	}
}