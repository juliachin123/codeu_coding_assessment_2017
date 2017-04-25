import java.util.*;
public class insertionSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		int[] a = new int[num];
		for (int i = 0; i < num; i++){
			a[i] = input.nextInt();
		}
		System.out.println("insertionSort");
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
		 insertionSort(a, list);
		 System.out.println("");
	}
	public static void insertionSort(int[] a, ArrayList<Integer> list){
        for (int i = 1; i < a.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
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