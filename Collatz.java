import java.util.*;
public class Collatz {
		public static void main (String [] args) {
		Scanner s = new Scanner(System.in);
		int x  = s.nextInt();
		int num = 0;
		for(int i = 0; i<x;i++){
			int y= s.nextInt(10);
			System.out.println(collatz(y));
			if(collatz(y)>num){
				num = collatz(y);
			}
		}
		System.out.println("Maximum: "+ num);
	}
	public static int collatz(int y){
		int count = 0;
		while(y != 1){
			count++;
			if(y % 2 == 0){
				y /= 2;
			}
			else{
				y = 3*y +1;
			}
		}
		return count+1;
	}
}