package pat;

import java.util.Scanner;
import java.util.Stack;

public class Main25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(); // stack capicity
		int n = in.nextInt(); // 每一行几个数字
		int k = in.nextInt(); // number of lines
		int[] arr = new int[n];
		for (int i = 0; i < k; i++) {
			Stack<Integer> s = new Stack<Integer>();
			boolean flag = false;
			int current = 0;
			// read each line first, otherwise it'll be tricky to read
			for (int j = 0; j < n; j ++)
				arr[j] = in.nextInt();
			
			for (int j = 1; j <= n; j++) {
				s.push(j);
				if (s.size() > m) {
//					System.out.printf("%d stack too big", i + 1);
					break;
				}
				while (!s.isEmpty() && s.peek() == arr[current]) {
					s.pop();
					current++;
				}
			}
			// if it's yes, current should be n.
			if (current == n) {
//				System.out.printf("%d over", i);
				flag = true;
			}
			
			if (flag) 
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		in.close();
	}
}
// stack size big than m, then NO
// 超时