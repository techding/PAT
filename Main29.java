package pat;

import java.util.Scanner;
import java.util.TreeSet;

public class Main29 {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		for (int i = 0; i < n1; i++) {
			set.add(in.nextInt());
		}
		int n2 = in.nextInt();
		for (int i = 0; i < n2; i++) {
			set.add(in.nextInt());
		}
		in.close();
		int mid = (n1 + n2 - 1) / 2;
		int i = 0;
		for (Integer a : set) {
			if (i == mid) System.out.println(a);
			i++;
		}
//		Scanner in = new Scanner(System.in);
//		
//		int a = in.nextInt();
//		int[] arra = new int[a];
//		for (int i = 0; i < a; i++) {
//			arra[i] = in.nextInt();
//		}
//	
//		int b = in.nextInt();
//		int[] arrb = new int[b];
//		for (int i = 0; i < b; i++) {
//			arrb[i] = in.nextInt();
//		}
//		
//		in.close();
//		
//		int[] c = new int[a + b];
//		System.arraycopy(arra, 0, c, 0, a);
//		arra = null;
//		System.arraycopy(arrb, 0, c, a, b);
//		arrb = null;
//		Arrays.sort(c);
//		int index = (a + b - 1) / 2;
//		System.out.println(c[index]);
	}
}

//ÒÀÈ»³¬Ê±
