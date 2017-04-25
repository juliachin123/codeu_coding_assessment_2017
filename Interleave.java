import java.util.*;
public class Interleave{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		int count = 0;
		while (input.hasNextInt()){
			int num = input.nextInt();
			if (num == 0){
				count++;
			}
			if (num!=0){
				if (count==0){
					list.add(num);
				}
				else{
					list2.add(num);
				}
			}
		}
		System.out.println("");
		System.out.println("Please enter a sequence of integers separated");			
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println("");
		System.out.println("Your first list: " +list);
		System.out.println("");
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println("");
		System.out.println("Your second list: " + list2);
		System.out.println("");
		int i=-1;
		for (Integer two : list2){
			if (i<list.size()-1){
				i+=2;
			}
			else {
				i++;
			}
			list.add(i, two);
		}
		System.out.println("Your interleaved list: " + list);
	}
}