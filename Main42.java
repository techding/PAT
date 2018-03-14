package pat;

import java.util.Scanner;

public class Main42 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] start = new int[55];
		int[] order = new int[55];
		int[] end = new int[55];
		for (int i = 1; i < start.length; i++) {
			start[i] = i;
			order[i] = in.nextInt();
		}
		in.close();
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < order.length; j++)
				end[order[j]] = start[j];
			start = end.clone();
		}
		char[] c = {'S', 'H', 'C', 'D', 'J'};
		for (int i = 1; i < end.length; i++) {
			int mod = end[i] % 13;
			int div = end[i] / 13;
			if (mod == 0) {
				mod = 13;
				div -= 1;		
			}
			System.out.printf("%c%d", c[div], mod);
			if (i < end.length - 1)
				System.out.print(" ");
		}
	}
}
