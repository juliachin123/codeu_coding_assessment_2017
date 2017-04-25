import java.util.*;
public class Mice2 {
	public static void main(String[] memes) {
		Scanner input = new Scanner(System.in);
		int r = input.nextInt();
		int c = input.nextInt();
		char[][] list = new char[r][c];
		for (int i = 0; i < r; i++) {
			String element = input.next();
			for (int j = 0; j < c; j++) {
				list[i][j] = element.charAt(j);
			}
		}
		mazeOutput(list);
	}
	public static void mazeOutput(char[][] list) {
		if (maze(list, 0, 0)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	public static boolean maze(char[][] list, int r, int c) {
		boolean found = false;
		if ((r < list.length - 1 && list[r+1][c] == 'M') || (r > 0 && list[r-1][c] == 'M') || (c < list[0].length - 1 && list[r][c+1] == 'M') || (c > 0 && list[r][c-1] == 'M')) {
			found = true;
		} else {
			list[r][c] = '-';
			if ((c < list[0].length - 1) && (list[r][c+1] == '.')) {
				found = maze(list, r, c+1);
				if (found) {
					return found;
				}
			}
			if ((c > 0) && (list[r][c-1] == '.')) {
				found = maze(list, r, c-1);
				if (found) {
					return found;
				}
			}
			if ((r < list.length - 1) && (list[r+1][c] == '.')) {
				found = maze(list, r+1, c);
				if (found) {
					return found;
				}
			}
			if ((r > 0) && (list[r-1][c] == '.')) {
				found = maze(list, r-1, c);
				if (found) {
					return found;
				}
			}	
		}
		return found;
	}
}