import java.util.*;
public class Count{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> type = new ArrayList<String>();
		ArrayList<Integer> count = new ArrayList<Integer>();
		while(input.hasNext()){
			String s = input.next();
			if (!s.equals("lastString")){
				list.add(s.toLowerCase());
			}
		}
		for (int i=0; i< list.size(); i++){
			if (!type.contains(list.get(i))){
				type.add(list.get(i));
			}
		}
		int[] count1= new int[type.size()];
		for (int i=0; i< list.size(); i++){
			for (int j=0; j<type.size(); j++){
				if ((list.get(i)).equals(type.get(j))){
					count1[j]++;
				}
			}
		}	
		for (int i=0; i< count1.length; i++){
			count.add(count1[i]);
		}
		Collections.sort(count);
		System.out.println("");
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println("");
		System.out.println("");
		System.out.println("Your original list: " + list);
		System.out.println("Count: " + count);
	}
}