package pat;

import java.util.Scanner;

public class Main81 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		in.nextLine();
		String s = in.next();
		String[] tokens = s.split("/");
		long a = Long.parseLong(tokens[0]);
		long b = Long.parseLong(tokens[1]);
		rat sum = new rat(a, b, 0);
		
		for (int i = 1; i < n; i++) {
			s = in.next();
			tokens = s.split("/");
			a = Long.parseLong(tokens[0]);
			b = Long.parseLong(tokens[1]);
			sum = sum.add(new rat(a, b, 0));
		}
		in.close();
		System.out.println(sum);
	}
}

class rat {
	long n; 
	long d;
	long in;
	public rat(long num, long den, long inte) {
		n = num;
		d = den;
		in = inte;
	}
	public void simp() {
		for (int i = 2; i < Math.min(n, d); i++) {
			if (n % i == 0 && d % i == 0) {
				n = n / i;
				d = d / i;
				i = 2;
			}
		}
		if (n / d >= 1){
			in = n / d;
			n = n % d;
		}
	}
	
	public rat add(rat r) {
		long a = n * r.d + r.n * d;
		long b = d * r.d;
		rat res = new rat(a, b, 0);
		res.simp();
		return res;
	}
	
	public String toString() {
		if (in == 0)
			return n + "/" + d;
		else if (n == 0)
			return in + "";
		else
			return in + " " + n + "/" + d;
	}
}
