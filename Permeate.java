import java.util.*;
public class Permeate{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String word = input.next();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(word);
		int [] count = new int[word.length()];
		for (int i = 0; i < word.length(); i++){
			if (!list.contains(word.charAt(i))){
				list.add("" + word.charAt(i));
			}
		}
		for (int i = 0; i < word.length(); i++){
			if (list.contains(word.charAt(i))){
				count[list.indexOf(word.charAt(i))]++;
			}
		}
		String s = "";
		for ( int i = 0; i < list.size(); i++){
			for (int j = 0; j <= count[i];j++){
				s += list.get(i);	
			}
		}
		list2.add(s);
		String p = "";
		for ( int i = list.size()-1; i >= 0; i--){
			for (int j = 0; j <= count[i];j++){
				p += list.get(i);	
			}
		}
		list2.add(s);
		Collections.sort(list2);
		System.out.println("Input string: ");
		for (int i = 0; i < list2.size(); i++){
			System.out.println(list2.get(i));
		}
	}

}