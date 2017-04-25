import java.util.*;
public class printSquares{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printSquares(n);
	}
	public static void printSquares(int n) {
		// call helper method
		recurse(n, new ArrayList<Integer>(), 0);
	}
		private static void recurse(int n, ArrayList<Integer> arr, int prev) {
			// base case
			if (n == 0){
				print(arr);
				return;
			}
			for (int i = prev + 1; i <= Math.sqrt(n); i++){
				int k = i * i;
				arr.add(i);
				recurse(n - k, arr, i);
				arr.remove(arr.size() - 1);
			}
		}
		private static void print(ArrayList<Integer> arr){
			for (int i = 0; i < arr.size(); i++){
				System.out.print(arr.get(i) + "^2");
				if (i != arr.size() -1)	// fencepost
					System.out.print(" + ");
			}
		System.out.println();
	}	
}
