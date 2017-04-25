/*import java.util.*;
import java.awt.*;
public class Projectile {
	public static final double ACCELERATION= -9.81;
	public static final int IV= 30;
	public static void main(String[] args) {
		Scanner angle= new Scanner(System.in);	
		System.out.println("Please enter the start angle in degrees:"); 
		double start= Math.toRadians(angle.nextInt());
		System.out.println("Please enter the end angle in degrees:"); 
		double end= Math.toRadians(angle.nextInt());
		System.out.println("Please enter the step size in degrees:"); 
		double steps= Math.toRadians(angle.nextInt());
		//System.out.println("MAX HEIGHT AT (x,y,t)=("+ +")");
		//System.out.println("LANDING       (x,y,t)=("+ +")");
		DrawingPanel panel =new DrawingPanel(1000,600);
		Graphics pic= panel.getGraphics();
		double xVelocity= IV*Math.cos(start);
		double yVelocity= IV*Math.sin(start);
		double totalTime= -2.0*yVelocity/ACCELERATION;
		double timeIncrement=totalTime/ steps;
		double xIncrement=xVelocity*timeIncrement;
		double x = 0.0;
        double y = 600.0;
        double t = 0.0;
        for (double i= start; i<= end; i+=steps) {
        	xVelocity= IV*Math.cos(i);
        	yVelocity= IV*Math.sin(i);	
        	t+=timeIncrement;
			x+=xIncrement;
			y= 600-(yVelocity*t+0.5*ACCELERATION*t*t);
			pic.setColor(new Color((int)i,(int)i,(int)i));
			pic.fillOval((int)x,(int)y,2,2);
        }
	}
}	*/

import java.util.*;
import java.awt.*;
public class Projectile {
	public static final double ACCELERATION= -9.81;
	public static final int IV= 30;
	public static void main(String[] args) {
		Scanner angle= new Scanner(System.in);	
		System.out.println("Please enter the start angle in degrees:");
		double start= Math.toRadians(angle.nextInt());
		System.out.println("Please enter the end angle in degrees:");
		double end= Math.toRadians(angle.nextInt());
		System.out.println("Please enter the step size in degrees:");
		double steps= Math.toRadians(angle.nextInt());
		DrawingPanel panel =new DrawingPanel(1000,650);
		Graphics pic= panel.getGraphics();
		double dots = 1000;
		pic.drawString("x-axis", 500, 620);
		pic.drawString("y-axis", 5,20);
		pic.setFont(new Font("Monospaced", Font.BOLD, 36));
		pic.drawString("Projectile Motion", 350,50);
		pic.drawLine(0,20,0,600);
		pic.drawLine(0,600,1000,600);
		pic.drawRect(800,50,150,80);
		pic.setColor(new Color(50,50,50));
		pic.fillRect(805, 60,10,10);
		pic.setColor(new Color(100,100,100));
		pic.fillRect(805, 80,10,10);
		pic.setColor(new Color(150,150,150));
		pic.fillRect(805, 100,10,10);
		pic.setColor(new Color(200,200,200));
		pic.fillRect(805, 120,10,10);
		pic.setFont(new Font("Monospaced", Font.PLAIN, 10));
		pic.setColor(new Color(50,50,50));
		pic.drawString("Legend",810,40);
        for(double i= start; i<= end; i+=steps){
        	double xVelocity= IV*Math.cos(i);
			double yVelocity= IV*Math.sin(i);
			double totalTime= -2.0*yVelocity/ACCELERATION;
			double timeIncrement=totalTime/dots;
			double xIncrement=xVelocity*timeIncrement;
			double x = 0.0;
	        double y = 0.0;
	        double t = 0.0;	
	        pic.setColor(Color.BLACK);
	        for (int k=1; k<=4;k++) {
	        	pic.drawString("Projectile "+k,400,160+70*k);
	       		pic.drawString("Projectile "+k,820,50+20*k);
	        pic.setColor(new Color((int)i,(int)i,(int)i));
			for (int j=1; j<= dots; j++) {
				t+=timeIncrement;
				x+=xIncrement;
				y= yVelocity*t+0.5*ACCELERATION*t*t;
				pic.setColor(new Color(50+50*(k-1),50+50*(k-1),50+50*(k-1)));
				pic.fillOval((int)(x*10),(int)(600-y*10),2,2);
			}
		}
		}
	}
}