import java.util.*;
public class bubbleSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++){
			a[i] = input.nextInt();
		}
		System.out.println("bubbleSort");
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
		bubbleSort(a);
		System.out.println("");
	}
	public static void bubbleSort(int[] a){
		for (int i = 0; i < a.length - 1; i++){
			for (int j = 1; j < a.length; j++){
				if (a[j - 1] > a[j]){
					int temp = a[j - 1];
					a[j - 1] = a[j];
					a[j] = temp;
				}
			}
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
// import java.util.*;
// public class bubbleSort{
// 	public static void main(String[] args){
// 		Scanner input = new Scanner(System.in);
// 		int[] a = new int[10];
// 		for (int i = 0; i < 10; i++){
// 			a[i] = input.nextInt();
// 		}
// 		System.out.println("bubbleSort");
// 		for (int l = 0; l < a.length; l++){
// 				if (l == 0){
// 					System.out.print("[");
// 				}

// 				System.out.print(a[l]);
// 				if (l != a.length-1){
// 					System.out.print(", ");
// 				}
// 				else{
// 					System.out.println("]");
// 				}
// 		}
// 		bubbleSort(a);
// 		System.out.println("");
// 	}
// 	public static void swap(int[] a, int i, int largest){
// 		int temp = a[i];
// 		a[i] = a[largest];
// 		a[largest] = temp;
// 	}
// 	public static void bubbleSort(int[] a){
// 		for (int i = a.length -1; i >= 0; i-- ){
// 			int largest = i;
// 			for (int j = i - 1; j >= 0; j--){
// 				if (a[j] > a[largest]){
// 					largest = j;
// 				}
// 			}
// 			swap (a, i, largest);
// 			for (int l = 0; l < a.length; l++){
// 				if (l == 0){
// 					System.out.print("[");
// 				}

// 				System.out.print(a[l]);
// 				if (l != a.length-1){
// 					System.out.print(", ");
// 				}
// 				else{
// 					System.out.println("]");
// 				}
// 			}
// 		}
// 	}
// }