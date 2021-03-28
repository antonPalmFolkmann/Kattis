package ADS;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Insertion;

import java.util.Comparator;

public class Grades {

	static class Student implements Comparable<Student>
	{
		String name;
		int grade; // higher is better
		int modifier; // higher is better
		char[] scale = { 'A', 'B', 'C', 'D', 'E', 'X', 'F' };

		Student(String name, String grade)
		{
			this.name = name;
			this.modifier = 0;
			String[] gradeparts = grade.split("");
			for (int i = 0; i < grade.length(); ++i)
				switch (grade.charAt(i)) {
					case 'A':
						this.grade = 12;
						break;
					case 'B':
						this.grade = 10;
						break;
					case 'C':
						this.grade = 7;
						break;
					case 'D':
						this.grade = 4;
						break;
					case 'E':
						this.grade = 2;
						break;
					case 'F':
						this.grade = -3;
						break;
					case 'X':
						this.grade = 0;
						break;
					case '+':
						++modifier;
						break;
					case '-':
						--modifier;
						break;
				}
		}

		public String toString() { return this.name; }

		public int compareTo(Student that)
		{
			if (this.grade > that.grade) return -1;
			if (this.grade < that.grade) return +1;
			if (this.modifier > that.modifier) return -1;
			if (this.modifier < that.modifier) return +1;
			return this.name.compareTo(that.name);
		}
	}

	public static void main(String[] args)
	{
		int n = StdIn.readInt();
		Student[] s = new Student[n];
		for (int i = 0; i < n; ++i) s[i] = new Student(StdIn.readString(), StdIn.readString());
		Insertion.sort(s);
		for (int i = 0; i < n; ++i) StdOut.println(s[i]);
	}
}
