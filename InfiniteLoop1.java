public class InfiniteLoop1{
	public static void main(String[] args){
		for (int i=1; i>=1; i*=5){
			System.out.println("i = " + i);
		}
	}
}