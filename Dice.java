import java.util.*;
public class Dice{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Desired dice sum: ");
		int num= s.nextInt();
		dice(num);
	}
	public static void dice(int num){
		int sum=0;	
		do {	
		Random generator= new Random();
		int x= generator.nextInt(6)+1;
		int y=generator.nextInt(6)+1; 
		sum=x+y;	
		System.out.println(x + " and " +y+ " = " + sum);	
		} while(sum!=num);
	}
}