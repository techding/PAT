package pat;

import java.util.Arrays;
import java.util.Scanner;

public class Main69 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int len = s.length();
		for (int i = 0; i < 4 - len; i++) {
			s = "0" + s;
		}
		char[] c = s.toCharArray();
		in.close();
		int[] arr = new int[4];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = c[i] - '0';
		}

		int diff = -1;
		while (diff != 6174 && diff != 0) {
			Arrays.sort(arr);
			int a = arr[3] * 1000 + arr[2] * 100 + arr[1] * 10 + arr[0];
			int b = arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
			diff = a - b;
			System.out.printf("%04d - %04d = %04d\n", a, b, diff);
			arr[0] = diff / 1000;
			arr[1] = diff % 1000 / 100;
			arr[2] = diff % 100 / 10;
			arr[3] = diff % 10;
		}
	}
}
// 超时 牛客网通过