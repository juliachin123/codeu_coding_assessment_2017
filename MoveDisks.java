import java.util.*;
public class MoveDisks{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Number of disks: ");
		int n = input.nextInt();
		System.out.println("Move " + n +" disks from post A to post B as follows:");
		String source = "A";
		String dest = "B";
		String temp = "C";
		moveDisks(n, source, dest, temp);
	}
	public static void moveOneDisk(String source, String dest){
		System.out.println("Move disk from " + source + " to " + dest);
	}
	public static void moveDisks(int n, String source, String dest, String temp){
		if (n == 1){
			moveOneDisk(source, dest);
		}
		else{
			moveDisks(n-1, source, temp, dest);
			moveOneDisk(source, dest);
			moveDisks(n-1, temp, dest, source);
		}
	}
}