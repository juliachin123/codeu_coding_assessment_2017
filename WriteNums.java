import java.util.*;
public class WriteNums{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int i= input.nextInt();
		order(i);
		System.out.println("");
	}
	public static void order(int i){
		if (i == 1){
			System.out.print(1);
		}
		else{
			order(i-1);
			System.out.print( ", " +i);
		}
	}
}