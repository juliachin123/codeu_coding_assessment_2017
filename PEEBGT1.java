import java.util.*;
import java.text.DecimalFormat;
import java.awt.*;
public class PEEBGT1 {
	public static void main(String[] args){
		System.out.println("Calculate radiant photon flux at a given wavelength");
		System.out.println("and temperature using Planck's Law");
		Scanner input= new Scanner(System.in);
		DrawingPanel panel= new DrawingPanel(1500,1000);
		Graphics g=panel.getGraphics();
		System.out.print("temperature in degrees Kelvin: ");
		double temp= input.nextInt();
		System.out.print("temperature2 in degrees Kelvin: ");
		double temp1= input.nextInt();
		for (int j=1; j<20; j++){
			System.out.print("wavelength in microns: ");
			double wavelength= input.nextDouble();
			int wave=(int)Math.log10(wavelength);
			wavelength=wavelength*1e-6;
			double h= 6.626068E-34;
			double c= 299792500;
			double k=1.38066E-23;
			double dexp= (h*c)/(wavelength*k*temp);
			double d= Math.exp(dexp)-1;
			double n= 2*h*Math.pow(c,2)*Math.pow(wavelength,-5);
			int b= (int)(n/d);
			double dexp1= (h*c)/(wavelength*k*temp1);
			double d1= Math.exp(dexp)-1;
			double n1= 2*h*Math.pow(c,2)*Math.pow(wavelength,-5);
			int b3= (int)((n1/d1)*1000000);
			g.setColor(Color.BLUE);
			g.fillOval(wave,b,50,50);
			g.setColor(Color.GREEN);
			g.fillOval(wave,b3,50,50);
		}
	}
}