import java.util.*;
public class PrintRange {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		printRange(x,y);
	}
	public static void printRange(int x, int y) {
			if (x<y) {
				for (int i=x; i<=y; i++){
					System.out.print(i+" ");				
				}
			}
			else if (x>y) {
				for (int i=x; i>=y; i--) {
					System.out.print(i+" ");
				}
			}
			else if (x==y) {
				System.out.print(x);
			}
	}
}