import java.util.*;
public class Try {
	public static void main(String[] args) {
		double n= 2.6455;
		System.out.println(Math.round(n));
	}
}	
		/*	int c=655;
		for(int i=0;i<2;i++){
			c=c/10;
			System.out.println(c);
			}
		System.out.println(99/100);	*/
		//char a='b';
		//System.out.println(a);

		/*Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int max = 0;
		for(int i = 0; i < x; i++) {
			int a = collatz(s.nextInt());
			System.out.println(a);
			if(a > max) {
				max = a;
			}
		}
		System.out.println(max);
	}

	public static int collatz(int n) {
		int a = 1;
		while(n != 1) {
			if(n % 2 == 0) {
				n /= 2;
			} else {
				n = n*3+1;
			}
			a++;
		}
		return a;
	}*/
	
	/*Random r= new Random();
		int i= r.nextInt();
		int mice= r.nextInt();
		int day=0;
		for (int j=1; j<= i; j++){
			while(i!=1){
				if (i%2==0){
					i/=2;
				}
				else{
					mice*=3;
					i+=1;
				}
			}
			day+=1;
			i=3*i+1;
		}
		System.out.println(day);*/
	//	String b= "67";
		//b= b.toLowerCase();
		//int x=1;
		//int b= Character.getNumericValue('6');
	//	int a=0;
	//	char c;
		//for (int i=0; i<b.length(); i++){
	//		c=b.charAt(i);
	//		a+=c;
	//	}
		
		//System.out.println(a);

		//public static boolean method(int x) {
			//int x=1;
	//		boolean b= true;
	//		if (x==1) {
	//			return b;
	//		}
	//		return false;
	//	}


//	System.out.printf("Standard deviation = %.3c", 'c');
		//	char a= '1';
		//	System.out.print(a);
		//}
	
/*Scanner s=new Scanner(System.in);
		printPalindrome(s);
	}
	public static void printPalindrome(Scanner s) {
		String word=s.next();
		int count=word.length();
		String a= ""; 
		for (int i=0; i<count; i++) {
			int one= word.charAt(i);
			a+=one;
			if (a.equals(word)) {
				System.out.println("palindrome");
			}
		//else {
		//	System.out.println("not palindrome");
		//}
		}	*/


	/*int z=0;
		for (int i=1; i<=rows; i++) {
			for (int k=rows; k>i; k--) {
				System.out.print(" ");
			}
			if (i==1) {
				System.out.println("1");
			}
			else if (i==2) {
				System.out.println("1  1");
			}
			else{
				System.out.print("1");
				int g= 3;
				for (int j=2; j<=i+1; j++) {
				int x= i;
				int y= (j-1);	
					if (x<9) {
						System.out.print("  ");
					}
					else if (x>=10 && x<=99) {
						System.out.print(" ");
					}
					else {
						System.out.print("");
					} 
				z= (x-y+1)/y;
				System.out.print(z);
					if (x<9) {
						System.out.print("  ");
					}
					else if (x>=10 && x<=99) {
						System.out.print(" ");
					}
					else {
						System.out.print("");
					}
				}
				System.out.println("1");
			}
		}*/		


	/*	import java.util.*;
public class DiceP {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		double rounds= s.nextInt();
		first(rounds);
	}
	public static void first(double rounds) {
		double count=0;	
		Random generator= new Random();
		for (int i=1; i<=rounds; i++) {
			double x= generator.nextInt(6)+1;
			count+=1;
			if (x!=6 && z==6) {
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
			else if (y!=6 && z==6) {
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
			else if (z==6){
				System.out.printf("%4f",count/rounds);
				System.out.println();
				break;
			}	
		}
	}
} */
/* while (!console.hasNextInt()) {
		console.next();

}
return console.nextInt(); */

/*if (x==6) {
					System.out.println("BOB");
				}
				else if (y==6) {
					System.out.println("COB");
					}
				*/	