package pat;

import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) {
		int up = 0;
		int down = 0;
		int curr = 0;
		int to = 0;
		int n = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		for (int i = 0; i < n; i++) {
			to = in.nextInt();
			if (to - curr > 0) {
				up += to - curr;
				curr = to;
			} else {
				down += curr - to;
				curr = to;
			}
		}
		in.close();
		
		System.out.println(n * 5 + up * 6 + down * 4);
	}
}
