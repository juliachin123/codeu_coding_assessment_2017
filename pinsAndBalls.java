import java.io.*;
import java.util.*;
public class pinsAndBalls{
	public static void main(String[] args)
		throws FileNotFoundException {
		System.out.print("Input file name: ");
		Scanner console = new Scanner(System.in);
		String file = console.next();
		File next = new File(file);
		if(!next.exists()){
			System.out.print("File not found. Try again: ");
			file = console.next();
			next = new File(file);
		}
		try {
			Scanner input = new Scanner(new File(file));
		} catch (FileNotFoundException e) {	
		}
		Scanner input = new Scanner(next);
		int rows = input.nextInt();
		ArrayList<ArrayList<Integer>> arrangement = new ArrayList<ArrayList<Integer>>();
		System.out.println("Pin arrangement:");
		for(int i = 0; i<rows;i++){
			arrangement.add(new ArrayList<Integer>());
			for(int j = 0; j<=i;j++){
				arrangement.get(i).add(input.nextInt());
				System.out.print(arrangement.get(i).get(j)+" ");
			}
			System.out.println();
		}
		System.out.print("Maximum possible score: ");
		System.out.println(arrangement.get(0).get(0)+maxSum(arrangement, 1, 0));
		
	}
	public static int maxSum(ArrayList<ArrayList<Integer>> list, int row, int column){
		if(row == list.size()-1){
			return Math.max(list.get(row).get(column+1), list.get(row).get(column));
		}
		else{
			return Math.max(list.get(row).get(column+1) + maxSum(list, row+1, column+1), list.get(row).get(column) + maxSum(list, row+1, column));
		}
	}
}