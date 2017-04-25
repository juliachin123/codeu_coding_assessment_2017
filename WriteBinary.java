import java.util.*;
public class WriteBinary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		System.out.print("Enter an integer: ");
		writeBinary(integer);
		System.out.println(""); 
	}
	public static void writeBinary(int integer){
		if (Math.abs(integer) < 2){
			System.out.print(integer);
		}
		else{
			writeBinary(integer/2);
			writeBinary(Math.abs(integer)%2);
		}
	} 
}