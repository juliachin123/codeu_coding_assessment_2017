import java.util.*;
public class Test{
	public static void main(String [] args){
		int n = 420;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(n);
		list.add(n);
		System.out.println(list.get(0) == list.get(1));
		//n = 120;
	}
}
