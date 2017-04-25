import java.util.*;
import java.io.*;
import java.net.*;

public class Day4EasyWebStock{

	public static void main(String[] args) throws FileNotFoundException, MalformedURLException, IOException {

		ArrayList<Stock> stocks = new ArrayList<Stock>();

		URL yourURL = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=+GOOG+YHOO+STX+T+V+IBM+DAX&f=+n+s+p2+e+r+r6+r7&e=.csv");

		Scanner input = new Scanner(yourURL.openStream());

		input.useDelimiter(",|\n");

		while (input.hasNext()) {

				String n= input.next();
				String x1= input.next();
				String s= input.next();
				String x2= input.next();
				String p2= input.next();
				String x3= input.next();
				String e= input.next();
				String x4= input.next();
				String r= input.next();
				String x5= input.next();
				String r6= input.next();
				String x6= input.next();
				String r7= input.next();

				Stock stock = new Stock (n, s, p2 , e, r, r6, r7);

				stocks.add(stock);
			

	}


	Scanner console = new Scanner(System.in);
	System.out.println();

	System.out.println("Choose a field to sort by (n, s, e):");

	String letter= console.next();

	System.out.println("Ascending or Descending (A or D)?");

	String order= console.next();

	System.out.println();
	System.out.println();




	System.out.printf("%-35s%-10s%-10s%-10s%-10s%-10s%-10s", "n", "s", "p2", "e", "r", "r6", "r7");
	System.out.println();
	
	System.out.println("-------------------------------------------------------------------------------------------");

	if (letter.equals("n")) {

		if (order.equals("A")) {

			Collections.sort(stocks, new NComparator());



			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}
		}

		else {

			Collections.sort(stocks, Collections.reverseOrder(new NComparator()));

			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}

		}


	}

	if (letter.equals("s")) {

		if (order.equals("A")) {
			Collections.sort(stocks, new SComparator());

			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}
		}

		else {

			Collections.sort(stocks, Collections.reverseOrder(new SComparator()));

			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}

		}


	}


	if (letter.equals("e")) {

		if (order.equals("A")) {
			Collections.sort(stocks, new EComparator());

			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}
		}

		else {

			Collections.sort(stocks, Collections.reverseOrder(new EComparator()));

			for (int i=0; i<stocks.size(); i++) {

				System.out.println(stocks.get(i));

			}

		}


	}

	System.out.println("-------------------------------------------------------------------------------------------");




	

	

}
}