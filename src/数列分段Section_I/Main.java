package 数列分段Section_I;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] firstLine = reader.readLine().split(" ");
		int N = Integer.valueOf(firstLine[0]);
		int M = Integer.valueOf(firstLine[1]);
		String[] secondLine = reader.readLine().split(" ");
		int[] A = new int[N];
		for (int i = 0; i < N; i++) {
			A[i] = Integer.valueOf(secondLine[i]);
		}
		int num = 0;
		int pointer = 0;
		while (pointer < A.length) {
			int temp = 0;
			while (pointer < A.length && temp + A[pointer] <= M) {
				temp += A[pointer];
				pointer++;
			}
			num++;
		}
		System.out.println(num);
	}
}
