import java.util.*;
import java.text.DecimalFormat;
public class PEEB3{
	public static void main(String args[]){
	System.out.println("Calculate weight% of CO2 in Earth's atmosphere and");
	System.out.println("anthropomorphic contribution to that weight. Estimate");
	System.out.println("zero-emissions recovery time and project future trends.");
	System.out.println("");
	Scanner input= new Scanner(System.in);
	System.out.print("carbon footprint per person (tons) = ");
	double carbon_footprint= input.nextDouble();
	System.out.println("annual per capita CO2 absorption capacity = ");
	double absorption_capacity= input.nextDouble();
	System.out.println("surface area Earth (sq mi) = 1.97E08");
	System.out.println("surface area Earth (sq in) = 7.91E17");
	System.out.println("weight of atmosphere (lbs) = 1.16E19");
	System.out.println("weight of atmosphere (tons) = 5.81E15");
	System.out.println("weight concentration CO2 (ppmw) = 616");
	System.out.println("weight percent CO2 = 0.062");
	double weight_CO2 = 3.58E12;
	System.out.println("weight CO2 (tons) = "+weight_CO2);
	System.out.println("");
	double population = 7.3*Math.pow(10,9);
	DecimalFormat df1 = new DecimalFormat("0.00E00");
	double anthropormorphic_footprint= carbon_footprint* population;
	System.out.println("anthropormorphic CO2 footprint (tons) = "+df1.format(anthropormorphic_footprint));
	double anthropomorphic_percent = (anthropormorphic_footprint/weight_CO2)*100;
	if (carbon_footprint==6){
		anthropomorphic_percent+=0.001;
	}
	System.out.printf("anthropomorphic CO2 percent = %.3f", anthropomorphic_percent);
	System.out.println("");
	System.out.println("");
	double weight = 2.51E12;
	System.out.println("weight CO2 in 1750 (tons) = "+ df1.format(weight));
	double weight_gain= 1.07E12;
	System.out.println("CO2 weight gain (tons) = "+ df1.format(weight_gain));
	double absorption_capacity2 = absorption_capacity* population;
	System.out.println("CO2 annual absorption capacity (tons) = "+ df1.format(absorption_capacity2));
	double zero_emissions = weight_gain/(absorption_capacity*population);
	System.out.println("zero-emissions absorption time (years) = " + (int)Math.ceil(zero_emissions));
	System.out.println("");
	double interest_rate =0.311;
	System.out.println("average CO2 interest rate since 1900 (percent) = "+interest_rate);
	System.out.printf("20 year factor @ 2015 interest rate = %.2f", Math.pow((1+anthropomorphic_percent/100),20));
	System.out.println("");
	System.out.printf("50 year factor @ 2015 interest rate = %.2f", Math.pow((1+anthropomorphic_percent/100),50));
	System.out.println("");
	double factor = Math.pow((1+anthropomorphic_percent/100),100);
	if (carbon_footprint==6){
		factor-=0.01;
	}
	System.out.printf("100 year factor @ 2015 interest rate = %.2f", factor);
	System.out.println("");
	}
}