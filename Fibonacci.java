public class Fibonacci {
	public static void main(String[] args) {
		long number1 = 0, number2 = 1, number3;   //long instead of int
		System.out.println(number1 + "\n" + number2);    //prints out first two numbers by definition
		for (int i = 3; i <= 50; i++) {      //loops through 48 more times
			number3 = number2 + number1;
			System.out.println(number3);
			number1 = number2;     	 
			number2 = number3;     //shifts values 
		}
	}
}
