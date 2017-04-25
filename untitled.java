import java.util.*;
public class bubbleSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++){
			a[i] = input.nextInt();
		}
		selectionSort(a);
	}
	public static void swap(int[] a, int i, int largest){
		int temp = a[i];
		a[i] = a[largest];
		a[largest] = temp;
	}
	public static void bubbleSort(int[] a){
		for (int i = a.length -1; i > 0; i-- ){
			int largest = i;
			for (int j = i - 1; j > 0; j--){
				if (a[j] > a[largest]){
					largest = j;
				}
			}
			swap (a, i, largest);
			for (int l = 0; l < a.length; l++){
				System.out.print(a[l]);
				if (l != a.length-1){
					System.out.print(" ");
				}
				else{
					System.out.println("");
				}
			}
		}
	}
}