import java.util.*;
public class shellSort{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int num = console.nextInt();
		int[] a = new int[num];
		for (int i = 0; i < num; i++){
			a[i] = console.nextInt();
		}
		printArray(a);
		shell(a);
		printArray(a);
	}
	public static void shell(int[] a) {
	int increment = a.length / 2;
	while (increment > 0) {
		for (int i = increment; i < a.length; i++) {
			int j = i;
			int temp = a[i];
			while (j >= increment && a[j - increment] > temp) {
				a[j] = a[j - increment];
				j = j - increment;
			}
			a[j] = temp;
		}
		if (increment == 2) {
			increment = 1;
		} else {
			increment *= (5.0 / 11);
		}
		printArray(a);
	}	
	}
	public static void printArray(int[] numbers){
		System.out.print("[");
		for(int i = 0; i < numbers.length-1; i++){
			System.out.print(numbers[i] + ", ");
		}
		System.out.println(numbers[numbers.length-1] + "]");
	}
}
