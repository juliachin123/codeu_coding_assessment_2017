import java.util.*;
public class DiceP {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double rounds= s.nextInt();
		first(rounds);
	}
	public static void first(double rounds) {
		double count=0;	
		Random generator= new Random();
		for (int i=1; i<=rounds; i++) {
			double x= generator.nextInt(6)+1;
			double y= generator.nextInt(6)+1;
			double z= generator.nextInt(6)+1;
			count+=1;
			while x, y, z not equal 6
			if (x!=6 && z==6) {
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
			else if (y!=6 && z==6) {
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
			else if (z==6){
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
		}
	}
}
/* while (!console.hasNextInt()) {
		console.next();

}
return console.nextInt(); */

/*if (x==6) {
					System.out.println("BOB");
				}
				else if (y==6) {
					System.out.println("COB");
					}
				*/	
