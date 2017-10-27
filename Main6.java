package pat;

import java.util.Scanner;

public class Main6 {
	
	public static class record {
		
		String id;
		Data in;
		Data out;
		public record(String Id, String In, String Out) {
			id = Id;
			in = new Data(In);
			out = new Data(Out);
		}
	}
	
	public static class Data {
		public int hour;
		public int min;
		public int sec;
		public Data(String str) {
			hour = Integer.parseInt(str.substring(0, 2));
			min = Integer.parseInt(str.substring(3, 5));
			sec = Integer.parseInt(str.substring(6));
		}
		
		public int earlyThan (Data d) {
			//  big than 1 means earlier
			if (this.hour != d.hour) {
				return d.hour - this.hour;
			}
			if (this.min != d.min) {
				return d.min - this.min;
			}
			if (this.sec != d.sec) {
				return d.sec - this.sec;
			}
			return 0;
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


