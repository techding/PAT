package pat;

import java.util.Scanner;

public class Main61 {
	public static void main(String[] args) {
		String[] day = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
//		System.out.println(findCommonCharacter("aba", "baac", 0));
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		String s3 = in.next();
		String s4 = in.next();
		in.close();
		int idx1 = findCommonCharacter(s1, s2, 0);
		Character c = s1.charAt(idx1);
		while (!Character.isUpperCase(c)) {
			idx1 = findCommonCharacter(s1, s2, idx1 + 1);
			c = s1.charAt(idx1);
		}
		System.out.print(day[s1.charAt(idx1) - 'A'] + " ");
		
		int idx2 = findCommonCharacter(s1, s2, idx1 + 1);
		c = s2.charAt(idx2);
		while (!(Character.isDigit(c) || (c >= 'A' && c <= 'N'))) {
			idx2 = findCommonCharacter(s1, s2, idx2 + 1);
			c = s1.charAt(idx1);
		}
		int hour = 0;
		if (Character.isDigit(c))
			hour = Integer.parseInt(c.toString());
		else
			hour = c - 'A' + 10;
		
		int idx3 = findCommonCharacter(s3, s4, 0);
		c = s3.charAt(idx3);
		while (!Character.isLetter(c)) {
			idx3 = findCommonCharacter(s3, s4, idx3 + 1);
			c = s3.charAt(idx3);
		}
		
		System.out.printf("%02d:%02d", hour, idx3);
		
	}
	
	public static int findCommonCharacter (String s1, String s2, int start) {
		int l1 = s1.length();
		int l2 = s2.length();
		for (int i = start; i < (l1 < l2 ? l1: l2); i++) {
			Character a = s1.charAt(i);
			Character b = s2.charAt(i);
			if (a.equals(b)) //&& (Character.isLetter(a) || Character.isDigit(a))
				return i;
		}
		return -1;
	}
}

//部分正确
