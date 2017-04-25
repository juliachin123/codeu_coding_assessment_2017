public class StarFigure {
	public static final int num= 3;
	public static void main (String[] args) {
		for (int i=1; i<= num; i++) {
			int aster= 8*i-8;
			int slash=20-4*i;
			for (int j=1; j<= slash; j++) {
				System.out.print("/");
			}
			for (int k=1; k<= aster; k++) {
				System.out.print("*");
			}
			for (int l=1; l<= slash; l++) {
				System.out.print("\\");
			}
			System.out.println();
		}
	}
}