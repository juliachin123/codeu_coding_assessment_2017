import java.util.*;
import java.io.*;
public class WordCount{
	public static void main(String[] args) 
		throws FileNotFoundException{
			Scanner s= new Scanner(System.in);
			File f= new File(s.next());
			Scanner input= new Scanner(f);
			int count=0;
			while (input.hasNext()) {
				String word=input.next();
				count++;
			}
			System.out.println("Total words = "+ count);
			
	}
}	