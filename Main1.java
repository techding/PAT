package pat;
import java.util.Scanner;
public class Main1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		in.close();
		System.out.printf("%,d", a + b);
	}
}
