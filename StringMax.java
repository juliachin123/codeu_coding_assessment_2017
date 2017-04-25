// Write a method that takes in a string and 
// returns the character with highest alpha value
// (highest ASCII)

// input:
// "rice"
// output:
// 'r'

// additional challenge:
// try sorting a string in alpha order using the max method

public class StringMax {

	public static void main(String[] args) {
		System.out.println(sort("rice"));
	}

	public static char max(String s) {
		char max = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > max) {
				max = s.charAt(i);
			}
		}
		return max;    
	}

	public static String sort(String s) {
		String newString = "";
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char max = 0;
			int maxIndex = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) > max) {
					max = s.charAt(j);
					maxIndex = j;
				}
			}
			newString = max + newString;
			s = s.substring(0, maxIndex) + s.substring(maxIndex + 1, s.length());
		}
		return newString;
	}

}
