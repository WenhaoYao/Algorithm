package 魔法照片;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;



class Person  {
	public int id;
	public int w;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
}

class MyComparator implements Comparator<Person> {

	@Override
	public int compare(Person a, Person b) {
		if(a.getW() < b.getW()) {
			return 1;
		}
		if(a.getW() == b.getW() && a.getId() > b.getId()) {
			return 1;
		}
		return -1;
	}
	
}

public class Main {
	
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int k = scan.nextInt();
		Person[] persons = new Person[n];
		for(int i = 0; i < n ;i ++) {
			persons[i] = new Person();
		}
//		设置下标值
		for(int i = 0; i < n ;i ++) {
			persons[i].setId(i + 1);
		}
//		设置额外权值
		int[] E = new int[10];
		for(int i = 0; i < 10; i ++) {
			E[i] = scan.nextInt();
		}
//		设置初始权值
		for(int i = 0; i < n; i ++) {
			persons[i].setW(scan.nextInt());
		}
		Arrays.sort(persons, new MyComparator());
		for(int i = 0; i < n; i ++) {
			persons[i].w += E[i%10];
		}
		Arrays.sort(persons, new MyComparator());
		for(int i = 0; i < k; i ++) {
			System.out.print(persons[i].getId() + " ");
		}
	}

}
