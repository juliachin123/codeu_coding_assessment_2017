import java.util.*;
public class Pascal{
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int rows = s.nextInt(); 
		value(rows); 
	}
	public static void value(int rows) { 
		for (int i = 0; i < rows; i++) { 
			for (int k=rows-1; k>i; k--) {
				System.out.print("  ");
			}
			int number = 1; 
			for (int j = 0; j <= i; j++) { 
				if (j==0) {
					System.out.print(number);
				}
				else{
				System.out.printf("%4d", number); 
				}
				number = number * (i - j) / (j + 1); 
			} 
			System.out.println(); 
		} 
	}
}	

