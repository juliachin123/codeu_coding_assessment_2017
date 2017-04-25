import java.util.*;
public class Calculator {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String one= s.next();
		System.out.println(Calcu(one));
	}

	public static int Calcu(String one) {
		int x=0;
		x=one.charAt(0)-'0';
		char c= '+';
		char d= '*';
		char e= '/';
		char f= '-';
		char g= '^';
		for (int i=0; i<one.length(); i++) {
			int y;
			y=one.charAt(i+1)-'0';
			/*
			if (i==one.charAt(i)) {
				x=y;
			}
			*/
			if (i==c) {
				x+=y;
			}
			else if (i==d) {
				x*=y;
			}
			else if (i==e) {
				x/=y;
			}
			else if (i==f) {
				x-=y;
			}
			else if (i==g){
				Math.pow(x,y);
			}
			else {
				System.out.print("You typed an error!");
			}
		}
		return x;
	}
}

//whenever

//output+=charAt(i+1)

import java.util.*;
public class StringCalc{

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String str = input.nextLine();
    calculate(str);
  }

  public static void calculate(String str){
    double finalNum = str.charAt(0) - 48;

    for(int i = 1; i< str.length(); i++){
      String temp = "" + str.charAt(i);

      if(temp.equals("+")){
        finalNum = finalNum + (str.charAt(i+1) - 48);
      }else if(temp.equals("-")){
        finalNum = finalNum -(str.charAt(i+1) - 48);
      }else if(temp.equals("*")){
        finalNum = finalNum * (str.charAt(i+1) - 48);
      }else if(temp.equals("/")){
        finalNum = finalNum / (str.charAt(i+1) - 48);
      }else if(temp.equals("^")){
        finalNum = Math.pow(finalNum, (str.charAt(i+1)-48));
      }
    }

    System.out.printf("%.2f", finalNum);
    System.out.println();
  }


}