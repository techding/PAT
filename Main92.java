package pat;

import java.util.Scanner;

public class Main92 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String t = in.next();
		in.close();
		int[] flag = new int[256];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			flag[c]++;
		}
		for (int i = 0; i < t.length(); i++) {
			char c = t.charAt(i);
			flag[c]--;
		}
		int less = 0, more = 0;
		for (int i = 0; i < 256; i++) {
			if (flag[i] > 0)
				more += flag[i];
			else
				less += flag[i];
		}
		if (less < 0)
			System.out.printf("No %d", -less);
		else
			System.out.printf("Yes %d", more);
	}
}
