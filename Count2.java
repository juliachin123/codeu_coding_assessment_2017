import java.util.*;
public class Count2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		int[] count = new int[26];
		while (!input.hasNext("lastString")){
			String s = input.next();
			if (!list.contains(s)){
				list.add(s);
			}
			for (int i=0; i< list.size(); i++){
				if (s.equals(list.get(i))){
					count[i]++;
				}
			}
		}
		for (int i=0; i< list.size(); i++){
			list2.add(count[i]+ list.get(i));
		}
		Collections.sort(list2);
		for (int i= 0; i< list.size(); i++){
			String element = list2.get(i);
			list2.set(i, element.substring(1,element.length()) + " "+ element.charAt(0));
		}
		System.out.println("");
		System.out.println("Please enter a sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println("");
		for(int i=0; i<list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}
}