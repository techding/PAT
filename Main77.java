package pat;

import java.util.Scanner;

public class Main77 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String ans = "";
		in.nextLine();
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			String revs = "";
			for (int j = str.length() - 1; j >= 0; j--) {
				revs = revs + str.charAt(j);
			}
			if (i == 0)
				ans = ans + revs;;
			int minlen = Math.min(ans.length(), revs.length());
			for (int j = 0; j < minlen; j++) {
				if (ans.charAt(j) != revs.charAt(j)) {
					ans = ans.substring(0, j);
					break;
				}
			}
		}
		in.close();
		if (ans.length() == 0)
			System.out.println("nai");
		for (int i = ans.length() - 1; i >= 0; i--) {
			System.out.print(ans.charAt(i));
		}
	}
}
// 超时 牛客网通过