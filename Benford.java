import java.util.*;
import java.io.*;
public class Benford{
	public static void main(String[] args)
	throws FileNotFoundException {
		Scanner s= new Scanner(System.in);
		System.out.println("Let’s count those leading digits...");
		String filename= s.next();
		Scanner input= new Scanner(new File(filename));
		int num=0;
		int zeros=0;
		int[] count= new int[9];
		while(input.hasNextInt()){
			int c=input.nextInt();
			num++;
			if (c==0){
				num--;
				zeros++;
			}
			for(int i=0;i<2;i++){
				c=c/10;
			}
			if((c-1)>=0){
				count[c-1]++;
			}
		}
		if (zeros>=1){
			System.out.println("input file name? excluding "+zeros+" zeros");
			System.out.println("Digit Count Percent");
		}
		else{
			System.out.println("input file name? Digit Count Percent");
		}
		for (int i=0;i<9;i++){
			System.out.print("    "+(i+1));
			System.out.printf("%6d",count[i]);
			System.out.printf("%7.2f",((double)(count[i])/(double)(num)*100));
			System.out.println();
		}
		System.out.print("Total");
		System.out.printf("%6d",num);
		System.out.println(" 100.00");
	}
}