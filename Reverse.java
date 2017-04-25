import java.util.*;
public class Reverse{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int x=s.nextInt();
		int[] list=new int[x];
		for (int i=0; i<list.length){
			list[i]=list[list.length-i];
		}
		System.out.println(Arrays.toString(list));
	}
}