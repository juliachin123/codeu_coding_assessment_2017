import java.util.*;
public class SigFig {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String number= s.next();
		zeros(number);
	}
	public static void zeros( String number) {
		int decimal=0;
		int count=0;
		int trailingzero=0;
		for (int i=0; i<number.length(); i++){
			if (decimal==1){
				if (count>0 || number.charAt(i)>='1') {
					count+=1;
				}
			}
			else{
				if (number.charAt(i)!='0' && number.charAt(i) !='.'){
					if (count>0) {
						count+=trailingzero;
						trailingzero=0;
					}
					count+=1;
					trailingzero=0;
				}
				else if (number.charAt(i)=='0') {
					trailingzero+=1;
				}
				else if (number.charAt(i)=='.') {
					if (count>0){
						count+=trailingzero;
						trailingzero=0;
					}
					else {
						trailingzero=0;
					}
					decimal=1;
				}
			}
		}
		System.out.println(count);
	}
}	