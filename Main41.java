package pat;

import java.util.Scanner;

public class Main41 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[100001];
		int[] m = new int[10000];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
			m[arr[i]]++;
		}
		in.close();
		for (int i = 0; i < arr.length; i++) {
			if (m[arr[i]] == 1) {
				System.out.println(arr[i]);
				return;
			}
		}
		System.out.println("None");
	}
}
