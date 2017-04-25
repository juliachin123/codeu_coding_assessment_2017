import java.util.*;
public class LCMGCD {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter positive integer a:     ");
		int one= s.nextInt();
		System.out.println("Enter positive another integer: ");
		int two= s.nextInt();
		int least= LCM(one,two);
		int greatest= GCD(one, two);
		product(least, greatest);
	}
	public static int LCM(int one, int two){
		int i=1;
		int j=1;
		while (one!=two){
			if (one<two){
				one*=i;
				one++;
			}
			else{
				two*=j;
				j++;
			}
		}
		return one;
	}
	public static int GCD(int one, int two){
		int num=0;
		while(two != 0) {
            num = one % two;
            one = two;
            two = num;
        }  
        return one;  
	}
	public static void product(int LCM, int GCD){
		int product= least*greatest;
		return product;

	}
}