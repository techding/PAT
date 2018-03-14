package pat;

import java.util.Scanner;

public class Main58 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] a = in.next().split("\\.");
		String[] b = in.next().split("\\.");
		in.close();
		long[] c = new long[3];
		long[] d = new long[3];
		long[] res = new long[3];
		for (int i = 0; i < a.length; i++) {
			c[i] = Long.parseLong(a[i]);
			d[i] = Long.parseLong(b[i]);
		}
		res[2] = c[2] + d[2];
		if (res[2] >= 29) {
			res[2] -= 29;
			res[1]++;
		}
		res[1] += c[1] +d[1];
		if(res[1] >= 17) {
			res[1] -= 17;
			res[0]++;
		}
		res[0] += c[0] + d[0];
		System.out.printf("%d.%d.%d", res[0], res[1], res[2]);
	}
}
// Å£¿ÍÍøÍ¨¹ý