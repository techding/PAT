package pat;

import java.util.Scanner;


public class Main6V2 {
	
	static class record {
		
		private String id;
		private Data in;
		private Data out;
		public record(String Id, String In, String Out) {
			id = Id;
			in = new Data(In);
			out = new Data(Out);
		}
	}
	
	static class Data {
		private int time;
		public Data(String str) {
			str = str.replace(":", "");
			//System.out.println(str);
			time = Integer.parseInt(str);
		}
		
		public int earlyThan (Data d) {
			//  big than 1 means earlier
			return d.time - this.time;
		}
		
	}
	
	
	public static void main(String[] args) {
		int n = 0;
		int first = 0;
		int last = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		record[] rec = new record[n];
		for (int i = 0; i < n; i++) {
			rec[i] = new record(in.next(), in.next(), in.next());
		}
		in.close();
		for (int i = 0; i < rec.length; i++) {
			if (rec[i].in.earlyThan(rec[first].in) > 0) {
				first = i;
			}
			if (rec[i].out.earlyThan(rec[last].out) < 0) {
				last = i;
			}
		}
		
		System.out.println(rec[first].id + " " + rec[last].id);
	}
}


// 内部类的变量即使是 private， 从外部也可以访问
// 改进：record 实现 comparable 接口， 用array.sort
