import java.util.*;
public class ArrayDuplicate{
	public static void main(String[] args){
		System.out.println("");
		System.out.println("Please enter an alphabetical sequence of strings separated");
		System.out.println("by spaces. The end of the sequence must be signified using");
		System.out.println("the sentinel value lastString, followed by a return.");
		System.out.println("");
		System.out.println("");
		Scanner input= new Scanner(System.in);
		ArrayList<String> list= getArray(input);
		System.out.println("Your original list: " + list);
		System.out.println("");
		ArrayList<String> list2= removeDuplicates(list);
		System.out.println("Your list with duplicates removed: " + list2);
		System.out.println("");
	}
	public static ArrayList<String> getArray(Scanner input){
		ArrayList<String> list= new ArrayList<String>();
		while (input.hasNext()){
			 String element= input.next();
			 if (!element.equals("lastString")){
				list.add(element);
			}
		}
		return list;
	}
	public static ArrayList<String> removeDuplicates(ArrayList<String> list){
		for (int i=0; i< list.size(); i++){
			if (i+1<list.size() && i-1>=0){
				if (list.get(i).equalsIgnoreCase(list.get(i+1))){
					list.remove(list.get(i+1));
				}
				if ( list.get(i).equalsIgnoreCase(list.get(i-1))){
					list.remove(list.get(i-1));
				}
			}	
		}
		return list;
	}	
}