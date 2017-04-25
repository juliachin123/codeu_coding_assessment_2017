import java.util.*;
public class Clump {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		while (!input.hasNext("stop")){
			String s = input.next();
			list.add(s);
		}
		int size = list.size();
		for (int i=0; i< size; i++){
			if (i%2 ==0 && i!=(size-1)){
				String combine = "(" + list.get(i) + " " + list.get(i+1) + ")";
				list2.add(combine);
			}			
		}
		if (size%2 !=0){
			list2.add(list.get(size-1));
		}	
		System.out.println("");
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. End the sequence with the sentinel");
		System.out.println("value \"stop\", followed by a return.");
		System.out.println("");
		System.out.println("Your original list: " + list);
		System.out.println("");
		System.out.println("Your clumped list: " + list2);
	}
}