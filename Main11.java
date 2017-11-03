package pat;

import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) {
//		System.out.println((4.1*3.0*2.5*0.65-1)*2);
//		37.974999999999994
//		解决方法：先保留三位小数，在保留两位小数；或者使用 BigDecimal
		String [] p = {"W", "T", "L"};
		double[] input = new double [3];
		int[] index = new int[3];
		double product = 1; 
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				input[j] = in.nextDouble();
			}
			index[i] = findMaxIndex(input);
			product *= input[index[i]] ;
		}
		for (int i = 0; i < 3; i++) {
			System.out.printf(p[index[i]] + " ");
		}
		in.close();
		double profit = Double.parseDouble(String.format("%.3f", (product * 0.65 - 1) * 2));
		System.out.printf("%.2f", profit);

	}
	
	private static int findMaxIndex (double[] arr) {
		int index = 0;
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > arr[index]) {
				index = i;
			}
		}
		return index;
	}
}
