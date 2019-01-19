package 合并果子;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main2 {

	static int[] first = new int[20001];
	static int[] second = new int[20001];
	static int[] temp = new int[20001];

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int kinds = Integer.valueOf(reader.readLine().trim());
		String[] fruits = reader.readLine().split(" ");
		int sum = 0;
		int pointer1 = 0, pointer2 = 0;
		for (int i = 0; i < 20001; i++) {
			first[i] = Integer.MAX_VALUE;
			second[i] = Integer.MAX_VALUE;
		}
		for (int i = 0; i < kinds; i++) {
			temp[Integer.valueOf(fruits[i])]++;
		}

		for (int i = 0; i < 20001; i++) {
			while (temp[i] > 0) {
				temp[i]--;
				first[pointer1++] = i;
			}
		}
		int tempSum = 0;
		int i = 0, j = 0;
		while (kinds > 1) {
			if (first[i] < second[j]) {
				tempSum = first[i++];
			} else {
				tempSum = second[j++];
			}
			if (first[i] < second[j]) {
				tempSum += first[i++];
			} else {
				tempSum += second[j++];
			}
			second[pointer2++] = tempSum;
			sum += tempSum;
			kinds--;
		}
		System.out.println(sum);
	}
}
