import java.util.*;
import java.io.*;
import java.net.*;

public class Day3bEasyWebStock{

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException {

		URL yourURL = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=+GOOG+YHOO+STX+T+V+IBM+DAX&f=+n+s+p2+e+r+r6+r7&e=.csv");

		Scanner sc = new Scanner(yourURL.openStream());

		sc.useDelimiter(",|\n");

		System.out.printf("%-35s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s%-10s", "n", "", "      s", "", "      p2", "", "      e", "", "      r", "", "      r6", "", "      r7");
		System.out.println();

		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
		for (int i = 0; i < 7; i++) {
			System.out.printf("%-35s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s%10s", sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------");
	}
}