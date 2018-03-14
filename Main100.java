package pat;

import java.util.Scanner;

public class Main100 {
	public static void main(String[] args) {
		String temp1 = "tret,jan,feb,mar,apr,may,jun,jly,aug,sep,oct,nov,dec";
		String temp2 = "tret,tam,hel,maa,huh,tou,kes,hei,elo,syy,lok,mer,jou";
		String[] ones = temp1.split(",");
		String[] tens = temp2.split(",");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i ++) {
			String s = in.nextLine();
			if (s.charAt(0) - '0' >= 0 && s.charAt(0) - '0' <= 9) {
				int num = Integer.parseInt(s);
				if (num < 12)
					System.out.println(ones[num]);
				else if (num % 13 == 0)
					System.out.println(tens[num / 13]);
				else 
					System.out.printf("%s %s\n", tens[num / 13], ones[num % 13]);
			}
			else {
				String stens = s.substring(0, 3);
				String sones = s.substring(3);
				if (sones.contains(" "))
					sones = sones.substring(1);
				int dec = 0;
				for (int j = 0; j < tens.length; j++) {
					if (stens.equals(tens[j]))
						dec += j * 13;
					if (stens.equals(ones[j]))
						dec += j;
				}
				for (int j = 0; j < ones.length; j++) {
					if (sones.equals(ones[j]))
						dec += j;
				}
				System.out.println(dec);
			}
		}
		in.close();
	}
}
