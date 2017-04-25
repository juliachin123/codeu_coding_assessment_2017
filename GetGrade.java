import java.util.*;
public class GetGradeoj  {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int one=s.nextInt();
		System.out.printf("%2.1f",getGrade(one));
	}
	public static double getGrade(int one) {
		if (one<60) {
			return 0.0;
		}
		else if (60<=one && one<=62) {
			return 0.7;
		}	
		else if (63<=one && one<=94) {
			double a=0.7;
			for (int i=63; i<=one; i++) {
				a+=0.1;
			}
			return a;
		}
		else {
			return 4.0;
		}
	}
}
