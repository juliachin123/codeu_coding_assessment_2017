import java.util.*;
public class RemoveInRange{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> reduced_list = new ArrayList<String>();
		String s= "";
		String start="";
		String end = "";
		while (!input.hasNext("lastString")){
			s= input.next();
			list.add(s);
			reduced_list.add(s);
		}
		String stop = input.next();
		start = input.next();
		end = input.next();
		for (int i=0; i< list.size(); i++){
			if (list.get(i).compareTo(start) >=0 && list.get(i).compareTo(end)<=0){
				reduced_list.remove(list.get(i));
			}
		}
		System.out.println("");
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println("");
		System.out.println("Your original list: " + list);
		System.out.println("");
		System.out.println("Now please enter your start String");
		System.out.println("");
		System.out.println("Finally, please enter your end String");
		System.out.println("");
		System.out.println("Your reduced list: " + reduced_list);
	}
}