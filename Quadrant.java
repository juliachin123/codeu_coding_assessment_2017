import java.util.*;
public class Quadrant {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("THE QUADRANT FOR THE POINT (x,y):");
		int x=s.nextInt();
		int y=s.nextInt();
		if (x>0&& y>0) {
			System.out.println("I");
		}
		else if (x<0 && y>0) {
			System.out.println("II");
		}
		else if (x<0 && y<0) {
			System.out.println("III");
		}
		else if (x>0 && y<0) {
			System.out.println("IV");
		}
		else if (x==0 && y==0) {
			System.out.println("0"); 
		}
		else {
			System.out.println("Error");
		}
	}
}