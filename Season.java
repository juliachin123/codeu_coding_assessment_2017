import java.util.*;
public class Season {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int month=s.nextInt();
		int day=s.nextInt();
		System.out.println(season(month,day));
	}
	public static String season(int month, int day) {
			if ((month==12 && day>=16)||(month==1 || month==2)||(month==3 && day<=15)) {
				return "winter";
			}
			else if ((month==3 && day>=16)||(month==4||month==5)||(month==6 && day<=15)){
				return "spring";
			}	
			else if ((month==6 && day>= 16)||(month==7||month==8)||(month==9 && day<=15)){
				return "summer";
			}
			else {
				return "fall";
			} 

	}
}
