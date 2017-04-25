public class InfiniteLoop2{
	public static void main(String[] args){
		writeStars(1,000);
	}
	// public static void writeStars(int n){
	// 	System.out.print("*");
	// 	writeStars(n);
	// }
	public static void writeStars(int n){
		if (n==0){
			System.out.println();
		}
		else{
			System.out.print("*");
			writeStars(n-1);
		}	
	}
}