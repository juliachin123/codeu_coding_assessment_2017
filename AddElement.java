import java.util.*;
public class AddElement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		System.out.println("Enter size of integer array: ");
		System.out.println("Enter n integers separated by spaces: ");
		int count = 0;
		int final_sum =0;
		System.out.println("The sum of the elements in your list: " + sum(input,size, count, final_sum));
	}
	public static int sum(Scanner input, int size, int count, int final_sum){
		if (count == size){
			return final_sum;
		}
		else{
			count++;
			final_sum += input.nextInt(); 
			return sum(input,size, count, final_sum);
		}
	}
}