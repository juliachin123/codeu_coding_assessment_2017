import java.util.*;
public class selectionSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++){
			a[i] = input.nextInt();
		}
		System.out.println("selectionSort");
		for (int l = 0; l < a.length; l++){
				if (l == 0){
					System.out.print("[");
				}

				System.out.print(a[l]);
				if (l != a.length-1){
					System.out.print(", ");
				}
				else{
					System.out.println("]");
				}
		}
		selectionSort(a);
		System.out.println("");
	}
	public static void swap(int[] a, int i, int smallest){
		int temp = a[i];
		a[i] = a[smallest];
		a[smallest] = temp;
	}
	public static void selectionSort(int[] a){
		for (int i = 0; i < a.length -1; i++ ){
			int smallest = i;
			for (int j = i + 1; j < a.length; j++){
				if (a[j] < a[smallest]){
					smallest = j;
				}
			}
			swap (a, i, smallest);
			for (int l = 0; l < a.length; l++){
				if (l == 0){
					System.out.print("[");
				}

				System.out.print(a[l]);
				if (l != a.length-1){
					System.out.print(", ");
				}
				else{
					System.out.println("]");
				}
			}
		}
	}
}