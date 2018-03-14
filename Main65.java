package pat;

//import java.math.BigInteger;
import java.util.Scanner;

public class Main65 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		for (int i = 1; i <= n; i++) {
//			BigInteger a = in.nextBigInteger();
//			BigInteger b = in.nextBigInteger();
//			BigInteger c = in.nextBigInteger();
//			System.out.printf("Case #%d: ", i);
//			System.out.println(a.add(b).compareTo(c) > 0 ? "true" : "false");
//		}
//		in.close();
		long a = 0, b = 0, c = 0;
		for (int i = 1; i <= n; i++) {
			a = in.nextLong();
			b = in.nextLong();
			c = in.nextLong();
			boolean flag;
			long sum = a + b;
			if (a > 0 && b > 0 && sum < 0)
				flag = true;
			else if (a < 0 && b < 0 && sum >= 0)
				flag = false;
			else 
				flag = sum > c;
				
			System.out.printf("Case #%d: %s\n", i, flag ? "true" : "false");
		}
		in.close();
	}
}
// 超时 牛客通过