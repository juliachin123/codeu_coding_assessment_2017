import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] list = new int[size];
		for (int i=0; i< size; i++){
			int element = input.nextInt();
			list[i]= element;
		}
		int compare = input.nextInt();
		int i=0;
		System.out.println(search(list, i, size, compare));
	}	
	public static int search(int[] list, int i, int size, int compare){
		if (list[i] == compare){
			return i;
		}
		else if (i < size-1){
			i++;
			return search(list, i, size, compare);
		}
		else{
			return -1;
		}
	}
}