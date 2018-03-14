package pat;

import java.util.HashMap;
import java.util.Scanner;

public class Main54 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		HashMap<Integer, Integer> hm= new HashMap<>();
		for (int i = 0; i < m * n; i++) {
			int temp = in.nextInt();
			if (hm.containsKey(temp)) {
				hm.put(temp, hm.get(temp) + 1);
				if (hm.get(temp) > m * n / 2) {
					System.out.println(temp);
					return;
				}
			}
			else
				hm.put(temp,  1);
		}
/*		int max = 0;
		for (int i : hm.keySet()) {
			if (hm.get(i) > max)
				max = hm.get(i);
		}
		for (int i : hm.keySet()) {
			if (hm.get(i) == max) {
				System.out.println(i);
				break;
			}
		}*/
	}
}
