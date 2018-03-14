package pat;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main35 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Queue<String> q = new LinkedList<String>();
		for (int i = 0; i < n; i++) {
			String t = in.next();
			String s = in.next();
			if (s.contains("1") || s.contains("0") || s.contains("l") ||s.contains("O")) {
				s = s.replace('1', '@');
				s = s.replace('0', '%');
				s = s.replace('l', 'L');
				s = s.replace('O', 'o');
				q.add(t + " " + s);
			}
		}
		in.close();
		if (q.isEmpty() && n == 1) 
			System.out.println("There is 1 account and no account is modified");
		else if (q.isEmpty() && n >= 1) 
			System.out.println("There are " + n + " accounts and no account is modified");
		else {
			System.out.println(q.size());
			while (!q.isEmpty()) {
				System.out.println(q.remove());
			}
		}
		
	}
}
