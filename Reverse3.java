import java.util.*;
public class Reverse3{
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		while (input.hasNextInt()){
			int s = input.nextInt();
			if(s!=0){
				list.add(s);
				list2.add(s);
			}
		}
		for (int i=0; i< list.size(); i++){
			if (i%3 == 0){
				int element = list.get(i);
				if (i+2<list.size()){
					list2.set(i,list.get(i+2));
					list2.set(i+2,element);
				}
			}
		}
		System.out.println("");
		System.out.println("Please enter a sequence of integers separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value 0, followed by a return.");
		System.out.println("");
		System.out.println("Your original list: " + list);
		System.out.println("");
		System.out.println("Your reversed3 list: " + list2);
	}
}
