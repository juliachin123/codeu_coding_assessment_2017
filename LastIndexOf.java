import java.util.*;
public class LastIndexOf {
	public static void main(String[] args) {
		int[] s = new int[7];
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter seven elements of an integer array and a value: ");
		for (int i=0; i< s.length; i++) {
			s [i]= input.nextInt();
		}
		int n= input.nextInt();
	 	int store= -1;
	 	for (int i=0; i<7; i++) {
		 	if (s[i]==n) {
		 		store=i;
		 	}
	 	}
	 	System.out.print("Last index of value = "+ store);
	 }
}
