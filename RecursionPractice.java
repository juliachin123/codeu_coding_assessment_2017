import java.util.*;
import java.io.*;

public class RecursionPractice{
	public static void main(String[] args) throws FileNotFoundException{
		factorial(1,5);

		File f= new File("TrumpTwitter.txt");
		Scanner inout = new Scanner(f);
		reverse(input);
	}
	public static void reverse(Scanner input){
		if (input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
			reverse(input);
			System.out.println(line);
		}
	}
}