package pat;

import java.util.Scanner;

public class Main96 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] fas = new int[32];
		int idx = 0;
		for (int i = 2; n != 1; i++) {
			if (n / i == 0)
				fas[idx++] = i;
			n = n / i;
		}
		
	}
}
