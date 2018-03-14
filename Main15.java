package pat;

import java.util.Scanner;

public class Main15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n;
		while((n = in.nextInt()) > 0) {
			int d = in.nextInt();
			if (!isPrime(n)) {
				System.out.println("No");
				continue;
			}
			int[] arr = new int[100];
			int len = 0;
			// to base d
			while (n != 0) {
				arr[len++] = n % d;
				n = n / d;
			}
			// to decimal
			for (int i = 0; i < len; i++) {
				n = n * d + arr[i];
			}
			System.out.println(isPrime(n) ? "Yes" : "No");
		}
	}
	
	static boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
