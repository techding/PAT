package pat;

import java.util.Scanner;

public class Main19 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int b = in.nextInt();
		in.close();
		int[] arr = new int[100];
		int len = 0;
		while (n != 0) {
			arr[len++] = n % b;
			n = n / b;
		}
		int flag = 1;
		for (int i = 0; i < len / 2; i++) {
			if (arr[i] != arr[len - i - 1]) {
				flag = 0;
			}
		}
		System.out.println(flag == 1 ? "Yes" : "No");
		for (int i = len - 1; i > 0; i--) {
			System.out.print(arr[i] + " ");
		}
		System.out.print(arr[0]);
	}
}
