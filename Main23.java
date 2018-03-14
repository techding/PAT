package pat;

import java.math.BigInteger;
import java.util.Scanner;

public class Main23 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		BigInteger n = in.nextBigInteger();
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		in.close();
		char[] c1 = String.valueOf(n).toCharArray();
		for (int i = 0; i < c1.length; i++) {
			int temp = c1[i] - '0';
			arr1[temp]++;
		}
		char[] c2 = String.valueOf(n.multiply(BigInteger.valueOf(2))).toCharArray();
		for (int i = 0; i < c2.length; i++) {
			int temp = c2[i] - '0';
			arr2[temp]++;
		}
		int flag = 1;
		for (int i = 0; i < 10; i++) {
			if (arr1[i] != arr2[i])
				flag = 0;
		}
		System.out.println(flag == 1 ? "Yes" : "No");
		System.out.println(n.multiply(BigInteger.valueOf(2)));
	}
}
