package pat;

import java.util.Scanner;

public class Main50 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		boolean[] flag = new boolean[256];
		for (int i = 0; i < c2.length; i++) {
			flag[c2[i]] = true;
		}
		for (int i = 0; i < c1.length; i++) {
			if (!flag[c1[i]] == true)
				System.out.print(c1[i]);
		}
	}
}
