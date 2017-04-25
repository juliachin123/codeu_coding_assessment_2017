import java.util.*;
import java.text.DecimalFormat;
import java.awt.*;
public class PEEBGT {
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
		g.drawString("Wavelength(λ) ",170,10);
		g.drawString("Temp. 2(°K)",340,10);
		g.drawString("B 1(Wm-3steradian-1)",510,10);
		g.drawString("Temp. 1(°K)",680,10);
		g.drawString("B 2(Wm-3steradian-1)", 850,10);
		g.drawLine(170,12,1020,12);
		for (int j=1; j<20; j++){
			g.drawLine(170,30*j,1020,30*j);
			System.out.print("wavelength in microns: ");
			double wavelength= input.nextDouble();
			g.drawString(""+wavelength,170,(30*j)-5);
			wavelength=wavelength*1e-6;
			double h= 6.626068E-34;
			double c= 299792500;
			double k=1.38066E-23;
			double dexp= (h*c)/(wavelength*k*temp);
			double d= Math.exp(dexp)-1;
			double n= 2*h*Math.pow(c,2)*Math.pow(wavelength,-5);
			double b= n/d;
			double dexp1= (h*c)/(wavelength*k*temp1);
			double d1= Math.exp(dexp1)-1;
			double n1= 2*h*Math.pow(c,2)*Math.pow(wavelength,-5);
			double b3= n1/d1;
			DecimalFormat df1 = new DecimalFormat("0.00E00");
			String b1=""+df1.format(b).toLowerCase();
			String b2=""+df1.format(b3).toLowerCase();
			g.drawString(""+temp,340,(30*j)-5);
			g.drawString(b1,510,(30*j)-5);
			g.drawString(""+temp1,680,(30*j)-5);
			g.drawString(b2,850,(30*j)-5);
		}
		for (int i=1; i<=6;i++){
			g.drawLine(170+170*(i-1),0,170+170*(i-1),570);
		}
	}
}