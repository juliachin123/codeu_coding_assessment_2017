public class HalfHourGlass {
	public static void main(String[] args) {
		for (int i=1; i<=4;i++) {
			for (int j=1; j<= (10-2*i); j++) {
				System.out.print("*");
			}
		System.out.println();	
		}
		for (int m=5; m<+5; m++) {
			for (int n=1; n<= (10-2*m); n++) {
				System.out.print("*");
			}
		}
		for (int l=1; l<=5; l++) {
			for (int k=1; k<= (l-1) + l; k++) {
				System.out.print("*");
			}
		System.out.println();		
		}
	}	
}