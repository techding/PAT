package pat;

import java.util.Scanner;

public class Main27 {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.print("#");
//		for (int i = 0; i < 3; i++) {
//			int num = in.nextInt();
//			String out = "";
//			for (int k = 0; k < 2; k++) {
//				int temp = num % 13;
//				num = num / 13;
//				if (temp < 10) {
//					out = out + temp;
//				} else if (temp == 10) {
//					out = out + "A";
//				} else if (temp == 11) {
//					out = out + "B";
//				} else if (temp == 12) {
//					out = out + "C";
//				}
//			}
//			for (int j = out.length() - 1; j >= 0 ; j--) {
//				System.out.print(out.substring(j, j + 1));
//			}
//		}
//		in.close();
//	}
//	÷«’œ
	public static void main(String[] args) {
		char[] a= {'0', '1', '2','3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C'};
		Scanner in = new Scanner(System.in);
		System.out.print("#");
		
		for (int i = 0; i < 3; i++) {
			int num = in.nextInt();
			System.out.printf("%c%c",a[num / 13], a[num % 13]);
		}
		in.close();
	}
}
