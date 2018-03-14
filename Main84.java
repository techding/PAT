package pat;

import java.util.Scanner;

public class Main84 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next().toUpperCase();
		String t = in.next().toUpperCase();
		in.close();
//		int len = s.length();
//		int[] flags = new int[256];
//		boolean[] flagt = new boolean[256];
//		for (int i = 0; i < s.length(); i++) {
//			int n = s.charAt(i);
//			if (flags[n] == 0)
//				flags[n] = 1;
//		}
//		for (int i = 0; i < t.length(); i++) {
//			int n = t.charAt(i);
//			flagt[n] = true;
//		}
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < len; i++) {
//			int n = s.charAt(i);
//			if (!flagt[n] && flags[n] == 1) {
//				sb.append((char)n);
//				flags[n] = 0;
//			}
//		}
//		System.out.println(sb);

		// better solution
		String ans = "";
		for (int i = 0; i < s.length(); i++) {
			String temp = String.valueOf(s.charAt(i));
			if (!t.contains(temp) && !ans.contains(temp))
				ans = ans + temp;
		}
		System.out.println(ans);
	}
}
