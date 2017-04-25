import java.util.*;
public class Sig {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String number= s.next();
		zeros(number);
	}
	public static void zeros( String number) {
		int sum=0;
		int zero=0;
		int count_zero=0;
		for (int i=0; i<number.length(); i++){
			if (number.charAt(i)!=0 && sum==0){
			//	if (i>0) {
			//		sum-=zero;
			//	}
				
				sum+=1;
				
			}
			else if (number.charAt(i)=='0') {
			
					sum+=1;
				//count+=1;
			}
			if (sum>=1) {
				if (number.charAt(i)=='0') {
					count_zero=1;
				}
				else if (number.charAt(i)=='.'){
					count_zero=1;
				}
				else {
					count_zero=0;
				}
				sum+=count_zero;
			}

		}
		System.out.println(sum);
	}
}