import java.util.*;
public class PEEB2{
	public static void main(String[] args){
	System.out.println("Calculate radiant power per unit area for Sun and Planet using\nStefan-Boltzman Law. From balance equation for Planet,\n(Power in) = (Power out), predict temperature of Planet.");
	Scanner input= new Scanner(System.in);
	System.out.print("Planet: ");
	String planet_name= input.next();
	System.out.print("distance of Planet from Sun (AU): ");
	double planet_distance= input.nextDouble()*1.50E+08;
	System.out.print("radius of Planet (km): ");
	double planet_radius= input.nextDouble();
	System.out.print("albedo of Planet: ");
	double planet_albedo= input.nextDouble();
	double sun_radius=700000;
	double ss=6.42E+07;
	double photon_flux=(ss*Math.pow(sun_radius,2))/(Math.pow(planet_distance,2)); 
	System.out.println("photon flux SP = "+(int)Math.round(photon_flux));
	double photon_avg=photon_flux/4;
	System.out.println("average photon flux SAve = "+(int)Math.round(photon_avg));
	double stefanBoltzman_constant= 5.67E-08;
	double albedo_save=photon_avg*(1-planet_albedo);
	System.out.println("including albedo SAve x (1 - alpha) = "+(int)Math.round(albedo_save));
	double temperature_kelvin= Math.sqrt(Math.sqrt(albedo_save/stefanBoltzman_constant));
	System.out.println("temperature TP (K) = "+(int)Math.round(temperature_kelvin));
	double temperature_celsius= temperature_kelvin- 273;
	System.out.println("temperature TP (C) = "+ (int)Math.round(temperature_celsius));
	}
}