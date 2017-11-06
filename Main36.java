package pat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main36 {
	public static class Student implements Comparable<Student>{
		String name;
		String gender;
		String id;
		int grade;
		
		public Student(String name, String gender, String id, int grade) {
			this.name = name;
			this.gender = gender;
			this.id = id;
			this.grade = grade;
		}

		@Override
		public int compareTo(Student s) {
			return this.grade - s.grade;
		}
		
		public String toString() {
			return name + " " + id;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ArrayList<Student> female = new ArrayList<>();
		ArrayList<Student> male = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Student s = new Student(in.next(), in.next(), in.next(), in.nextInt());
			if (s.gender.equals("M")) {
				male.add(s);
			} else {
				female.add(s);
			}
		}
		in.close();
		Student[] f = new Student[female.size()];
		Student[] m = new Student[male.size()];
		female.toArray(f);
		male.toArray(m);
		Arrays.sort(f);
		Arrays.sort(m);
		
		if (f.length == 0) {
			System.out.println("Absent");
		} else {
			System.out.println(f[f.length - 1]);
		}
		
		if (m.length == 0) {
			System.out.println("Absent");
		} else {
			System.out.println(m[0]);
		}
		
		if (f.length == 0 || m.length == 0) {
			System.out.print("NA");
		} else {
			System.out.print(f[f.length - 1].grade - m[0].grade);
		}
	}
}

//其实不用都保存下来。。。。只留最大的女和最小的男就行了。。。。。