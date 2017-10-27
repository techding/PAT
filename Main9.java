package pat;

import java.util.Scanner;

public class Main9 {
	public static void main(String[] args) {
		double[] arr = new double[1001];
		double[] ans = new double[2001];
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int a = 0;
		double b = 0;
		for(int i = 0; i < k; i++) {
			arr[in.nextInt()] += in.nextDouble();
		}
		k = in.nextInt();
		for(int i = 0; i < k; i++) {
			a = in.nextInt();
			b = in.nextDouble();
			for(int j = 0; j < 1001; j++) {
				ans[a + j] += b * arr[j];
			}
		}
		in.close();
		
		int cnt = 0;
		for (int i = 0; i < 2001; i++) {
			if (ans[i] != 0) {
				cnt++;
			}
		}
		
		System.out.print(cnt);
		
		for (int i = 2000; i >= 0; i--) {
			if (ans[i] != 0) {
				System.out.printf(" %d %.1f", i, ans[i]);
			}
		}
	}
}
