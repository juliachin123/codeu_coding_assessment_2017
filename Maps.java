import java.util.*; 
public class Maps {
	public static void main(String[] args) {
		System.out.println("This program computes the spherical distance between two points, 1 and 2.");
		System.out.println();
		System.out.println("Please enter the latitude and longitude for each point as a pair of integers, degrees followed by minutes:");
		System.out.println();
		Scanner map= new Scanner(System.in);
		System.out.print("latitude_1? ");
		double latitude_1= map.nextInt();
		double latitude_11= map.nextInt();
		System.out.print("longitude_1? ");	
		double longitude_1= map.nextInt();
		double longitude_11= map.nextInt();
		System.out.print("latitude_2? ");
		double latitude_2=map.nextInt();
		double latitude_22=map.nextInt();
		System.out.print("longitude_2? ");
		double longitude_2=map.nextInt();
		double longitude_22=map.nextInt();
		double first= Math.sin(Math.PI/180*(latitude_1+latitude_11/60));
		double second= Math.sin(Math.PI/180*(latitude_2+latitude_22/60));
		double third= Math.cos(Math.PI/180*(latitude_1+latitude_11/60));
		double fourth= Math.cos(Math.PI/180*(latitude_2+latitude_22/60));
		double seven= (Math.PI/180*(longitude_2+longitude_22/60));
		double eight= (Math.PI/180*(longitude_1+longitude_11/60));
		double fifth= Math.cos(seven-eight);
		double adistance= Math.acos(first*second+ third*fourth*fifth);
		System.out.println("Angular distance= " + adistance +" radians");
		int kdistance= (int)(adistance*6372.795);
		int mdistance= (int)(kdistance*0.621371);
		System.out.println("Distance        =" + kdistance + " kilometers");
		System.out.println("Distance        =" + mdistance + " miles");
	}
}		