package 排队接水;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


class Person{
	int id;
	int time;
}

public class Main {
	static Person[] tempTime = new Person[1001];

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.valueOf(reader.readLine().trim());
		String[] timeString = reader.readLine().split(" ");
		Person[] persons = new Person[number];
		for (int i = 0; i < number; i++) {
			persons[i] = new Person();
			persons[i].id = i + 1;
			persons[i].time = Integer.valueOf(timeString[i]);
		}
		mergeSort(persons, 0, number - 1);
		double waitingTime = 0;
		for (int i = 0; i < number; i++) {
			waitingTime += persons[i].time * (number-i-1);
		}
		DecimalFormat format = new DecimalFormat("0.00");
		for (Person person : persons) {
			System.out.print(person.id + " ");
		}
		System.out.println();
		System.out.print(format.format(waitingTime / (double) number));
	}
	
	static void mergeSort(Person[] persons, int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(persons, left, mid);
		mergeSort(persons, mid + 1, right);
		merge(persons, left, mid, right);
	}

	private static void merge(Person[] persons, int left,int mid, int right) {
		int p = 0;
		int pl = left, pr = mid;
		int ql = mid + 1, qr = right;
		while(pl <= pr && ql <= qr) {
			if(persons[pl].time <= persons[ql].time) {
				tempTime[p++] = persons[pl++];
			} else {
				tempTime[p++] = persons[ql++];
			}
		}
		while(pl <= pr) {
			tempTime[p++] = persons[pl++];
		}
		while(ql <= qr) {
			tempTime[p++] = persons[ql++];
		}
		while(left <= right) {
			persons[right--] = tempTime[--p];
		}
	}

}
