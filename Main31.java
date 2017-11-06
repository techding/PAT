package pat;

import java.util.Scanner;

public class Main31 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		in.close();
		int len = s.length();
		int n = (len + 2) / 3;
		int spaceNum = len - 2 * n;
		for (int i = 0; i < n - 1; i++) {
			System.out.printf("%c", s.charAt(i));
			for (int j = 0; j < spaceNum; j++) {
				System.out.printf(" ");				
			}
			System.out.printf("%c\n", s.charAt(len - 1 - i));
		}
		System.out.print(s.substring(n - 1, len - n + 1));
	}
}

//图形打印
//有三种情况，但是 n = (len + 2) / 3 不变
//注意一下空格个数就好