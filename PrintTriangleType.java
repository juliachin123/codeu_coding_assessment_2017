import java.util.*;
public class PrintTriangleType {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int one=s.nextInt();
		int two=s.nextInt();
		int three=s.nextInt();
		printTriangleType(one,two,three);
	}
	public static void printTriangleType(int one, int two, int three) {
		if (one==two&& two==three) {
			System.out.println("equilateral");
		}
		else if ((one==two)||(two==three)||(one==three)) {
			System.out.println("isosceles");
		}
		else{
			System.out.println("scalene");
		}
	}
}