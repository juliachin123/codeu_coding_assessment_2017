import java.util.*;
public class AsciiSum {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		String s= input.next();
		int num=input.nextInt();
		int sum=0;
		for (int i=0; i<s.length(); i++){
			if (i!=num) {
				sum +=(int)(s.charAt(i));
			}
		}
		System.out.println(sum);
	}
}