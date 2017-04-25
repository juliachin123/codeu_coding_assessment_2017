import java.utilScanner
public class Book {
	public static void main(String[] args) {
		public static Scanner console= new Scanner(System.in);
		public static final int SIZE= console.nextInt();	
		Boundary(); //includes top of the book
		CoverAndPages(); //inclues part of the cover and part of the pages
		Border(); //include border of side and front cover
		SideAndPages(); //includes side, part of the pages, and the cost
		Bottom(); //includes the bottom of the side and the cost
	}	
	public static void Boundary() {
		for(int o=1; o<=1;o++) {
			for (int q=0; q<=SIZE; q++){
				System.out.print(" ");
			}	
			System.out.print("+");
			for (int p=1; p<=((3*SIZE));p++ ) {
				System.out.print("-");
			}
			System.out.print("+");	
		}
		System.out.println();	
	}	
	public static void CoverAndPages() {
		for (int i=1; i<=SIZE; i++) {
			for(int t=0; t<= (SIZE-i);t++){
				System.out.print(" ");
			}
			System.out.print("/");
			for (int j=1; j<=(SIZE-i);j++) {
				System.out.print("   ");
			}
				System.out.print("___/");
			for (int k=1; k<=(i-1);k++) {
				System.out.print("__/");
			}
			for (int l=1; l<=(i-1);l++) {
				System.out.print("/");
			}
			System.out.println();
		}
	}
	public static void Border() {
		for(int o=1; o<=1;o++) {
		System.out.print("+");
			for (int p=1; p<=((3*SIZE));p++ ) {
				System.out.print("-");
			}
		System.out.print("+");	
			for (int t=1; t<=(SIZE); t++) {
				System.out.print("/");
			}
		System.out.println();	
		}
	}
	public static void SideAndPages() {
		for (int i=1; i<=((int)(SIZE/2)); i++) {
		System.out.print("|");
			for(int j=1; j<=((((SIZE*3)-22)/2));j++) {
				System.out.print(" ");
			}
		System.out.print("Building Java Programs");	
			for(int k=1; k<=((((SIZE*3)-22)/2));k++) {
				System.out.print(" ");
			}
		System.out.print("|");	
			for(int n=1; n<=(SIZE-2*(i-1)); n++) {
				System.out.print("/");
			}
		System.out.println();
		}
	}
	public static void Bottom() {
		for(int i=1; i<=1;i++) {	
		System.out.print("+");
			for (int k=1; k<=((3*SIZE));k++) {
				System.out.print("-");
			}
		System.out.println("+");
			}	
	System.out.println("Now only $"+ (9*SIZE) + "!");
	}
	
}