import java.util.*;
public class SmallestLarge {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		smallestLargest(s);
	}
	public static void smallestLargest(Scanner s) {
		System.out.println("How many numbers do you want to enter?");
		int first=s.nextInt();
		int max=0;
		int min=10000;
		for (int i=1; i<=first; i++) {
			System.out.println("Number "+i+":");
			int two=s.nextInt();
			if (two>max){
				max=two;
			}
			else if (two<min) {
				min=two;
			}
		}
		System.out.println("Smallest = "+ min);
		System.out.println("Largest = "+ max);
	}
}
