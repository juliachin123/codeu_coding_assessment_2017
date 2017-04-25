public class Timecapsule {
	public static final int LINES= 5;
	public static void main(String[] args) {
		System.out.println("     *");
		for (int top=1; top<= LINES; top++) { 
			for (int b=1; b<= LINES-top; b++) {
				System.out.print(" ");
			}
			int circ= (2*top-1);
			System.out.print("/");
			for (int a= 1; a<= (circ); a++) {
				System.out.print("o");	
			}
			System.out.print("\\");
			System.out.println();
		}
		System.out.println("|@@@@@@@@@|");
		for (int j= 1; j<8; j++) {
				System.out.println("|@	 @|");
			}
		System.out.println("|@@@@@@@@@|");	
		for(int line=1; line<= LINES; line++) {
			for (int i=1; i<= (line -1); i++) {
				System.out.print(" ");
			}
			int circles= 2 * LINES + 1 - 2 *line;
			System.out.print("\\");
			for (int i=1; i<= circles; i++) {
				System.out.print("o");
			}
			System.out.print("/");
			System.out.println();
		}
		System.out.println("     *");
	}
}