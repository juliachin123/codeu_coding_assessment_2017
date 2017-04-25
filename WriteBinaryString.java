import java.util.*;
public class WriteBinaryString{
	private static String binaryS;
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		System.out.print("Enter an integer: ");
		System.out.println("Binary expression: " + writeBinary(integer));
	
	}
	public static String writeBinary(int integer){
		if (Math.abs(integer) < 2){
			binaryS = "" + integer;
			return binaryS;
		}
		else{
			writeBinary(integer/2);
			binaryS += "" + writeBinary(Math.abs(integer)%2);
		}
		return binaryS;
	} 
}