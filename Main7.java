package pat;

import java.util.Scanner;

public class Main7 {
	static class Value {
		int first;
		int last;
		public Value(int f, int l) {
			first = f;
			last = l;
		}
		@Override
		public String toString() {
			return " " + first + " " + last;
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int[] arr = new int[k];
		int[] q = new int[k];
		for (int i = 0; i < k; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		
		Value[] val = new Value[k];
		q[0] = arr[0];
		int qMaxIndex = 0;
		int first = arr[0];
		int last = arr[0];
		for (int i = 1; i < k; i++) {
			if (q[i - 1] >= 0) {
				q[i] = q[i - 1] + arr[i];
				last = arr[i];
			} else {
				q[i] = arr[i];
				first = arr[i];
				last = arr[i];
			}
			if (q[i] > q[qMaxIndex]) 
				qMaxIndex = i;
			val[i] = new Value(first, last);
		}
		if (qMaxIndex == 0) {
			System.out.println("0 " + arr[0] + " " + arr[k - 1]);
		} else
			System.out.println(q[qMaxIndex] + val[qMaxIndex].toString());
	}
}
// 一个测试点未通过