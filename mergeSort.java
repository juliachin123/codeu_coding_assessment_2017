import java.util.*;
public class mergeSort {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++){
			a[i] = input.nextInt();
		}
		System.out.println("mergeSort");
	    System.out.println(Arrays.toString(a));
	    mergeSort(a);
	    System.out.println(Arrays.toString(a));
	}
	public static void mergeSort(int[] a) {
        if (a.length > 1) {
			int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
			int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
			mergeSort(left);
			mergeSort(right);
			merge(a, left, right);
    	}
	}
	public static void merge(int[] result, int[] left, int[] right) {
	    int i1 = 0;  
	    int i2 = 0;   
	    for (int i = 0; i < result.length; i++) {
	        if (i2 >= right.length || (i1 < left.length && left[i1] <= right[i2])) {
	            result[i] = left[i1];
				i1++; 
			} else {
	    		result[i] = right[i2];
	    		i2++;
	    	}
	    }
    }
}