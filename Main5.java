package pat;

import java.util.Scanner;

public class Main5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] map = {"zero", "one", "two", "three", "four",
				"five", "six", "seven", "eight", "nine"};
		String n = in.next();
		in.close();
		int sum = 0;
		for (int i = 0; i < n.length(); i++) {
			String inDigit = n.substring(i, i + 1);
			sum += Integer.parseInt(inDigit);
		}
		//System.out.println(sum);
		
		String res = String.format("%s", sum);
		for (int i = 0; i < res.length() - 1; i++) {
			String outDigit = res.substring(i, i + 1);
			int index = Integer.parseInt(outDigit);
			System.out.print(map[index] + " ");
		}
		String outDigit = res.substring(res.length() - 1, res.length());
		int index = Integer.parseInt(outDigit);
		System.out.print(map[index]);
	}
}
