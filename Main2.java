package pat;

import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] array = new double[1001];
		
		for (int i = 0; i < 2; i++) {
			int k = in.nextInt();
			for (int j = 0; j < k; j++) {
				array[in.nextInt()] += in.nextDouble(); 
			}
		}
		in.close();
		
		int cnt = 0;
		for (int i = 0; i < 1001; i++) {
			if (array[i] != 0) {
				cnt++;
			}
		}
		
		System.out.print(cnt);
		for (int i = 1000; i >= 0; i--) {
			if (array[i] != 0) {
				System.out.printf(" %d %.1f", i, array[i]);
			}
		}
	}
}
