import java.util.*;
import java.io.*;
public class WebStock {
	public static void main(String[] args) throws FileNotFoundException{
		Scanner console = new Scanner(System.in);
		String file = console.next();
		Scanner input = new Scanner( new File(file));
		int ticket = input.nextInt();
		String s= "";
		for(int i = 0; i <= ticket; i++){
			s += input.nextLine();
			if(i != ticket){
				s += "+";
			}
		}
		int variable= input.nextInt();
		String s1 = "";
		for (int i = 0; i <= variable; i++){
			s1 += input.nextLine();
			if(i != variable){
				s1 += "+";
			}
		}
		System.out.println("http://download.finance.yahoo.com/d/quotes.csv?s="+s+"&f="+s1+"&e=.csv");
	}
}