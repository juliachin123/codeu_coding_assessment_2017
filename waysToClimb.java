import java.util.*;
public class waysToClimb{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int steps = input.nextInt();
		waysToClimb(n, steps);
	}
	// public static void waysToClimb(int n) {
	// 	recurse(n, "[");
	// }
	// // helper method
	// private static void recurse(int n, String s){
	// 	// base cases
	// 	if(n < 0) return;
	// 	if(n == 0) {
	// 		// fencepost
	// 		System.out.print(s.substring(0, s.length() - 2));
	// 		System.out.println("]");
	// 		return;
	// 	}
	// 	// recursive cases
	// 	recurse(n - 1, s + "1, ");
	// 	recurse(n - 2, s + "2, ");
	// }

	public static void waysToClimb(int n, int steps) {
	recurse(n, steps, new ArrayList<Integer>(), new ArrayList<String>());
	}
	// helper method
	private static void recurse(int n, int steps, ArrayList<Integer> arr, ArrayList<String> arr1){
		//base cases
		if(n < 0) return;
		if(n == 0) {
			if (!arr1.contains("" + arr)){
				arr1.add("" +arr);
				System.out.println(arr);
			}	//fencepost
			return;
		}
		//recursive cases
		arr.add(n);
		recurse(n - 1, steps, arr, arr1);
		arr.remove(arr.size() - 1);
		n -= 1;
		if (n != 0){
			arr.add(n);
			recurse(n, steps, arr, arr1);
			arr.remove(arr.size() - 1);
		}
	}	

}


	
