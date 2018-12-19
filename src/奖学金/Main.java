package 奖学金;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;


class Grade{
	int gradeId;
	int chinese;
	int math;
	int english;
	int total;
	public Grade(int gradeId, int chinese, int math, int english) {
		super();
		this.gradeId = gradeId;
		this.chinese = chinese;
		this.math = math;
		this.english = english;
		this.total = chinese + math + english;
	}
	
	
}

class MyComparator implements Comparator<Grade>{

	@Override
	public int compare(Grade a, Grade b) {
		if(a.total < b.total) {
			return 1;
		}
		if(a.total == b.total && a.chinese < b.chinese) {
			return 1;
		}
		if(a.total == b.total && a.chinese == b.chinese && a.gradeId > b.gradeId) {
			return 1;
		}
		return -1;
	}
	
}

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nums = scanner.nextInt();
		Grade[] grades = new Grade[nums];
		for(int i = 0; i < nums; i ++) {
			grades[i] = new Grade(i + 1, scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		}
		Arrays.sort(grades,  new MyComparator());
		for(int i = 0; i < 5; i++) {
			System.out.println(grades[i].gradeId + " " + grades[i].total);
		}
	}
}
