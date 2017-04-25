public class PrintPractice {
	public static void main(String[] args) {
		String s= "abcd";
		int one= s.indexOf('a') +1;
		int two=s.indexOf('b')+1;
		int three=s.indexOf('c')+1;
		int four= s.indexOf('d')+1;
		double x= Math.toRadians(two+four-one-three);
		double y=Math.sin(x);
		System.out.printf("%6.7f",y);
	}
}