package 拼数;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	static String[] string = new String[20];
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int line = Integer.valueOf(reader.readLine());
		String[] s = reader.readLine().split(" ");
		mergeSort(s, 0, line - 1);
		for (String string : s) {
			System.out.print(string);
		}
	}
	
	public static void mergeSort(String[] s, int left, int right) {
		if(left >= right ) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(s, left, mid);
		mergeSort(s, mid + 1, right);
		merge(s, left, mid, right);
	}
	
	static void merge(String[] s, int left, int mid, int right) {
		int p = 0;
		int pl = left, pr = mid;
		int ql = mid + 1, qr = right;
		while(pl <= pr && ql <= qr) {
			String s1 = s[pl] + s[ql];
			String s2 = s[ql] + s[pl];
			if(s1.compareTo(s2) > 0) {
				string[p++] = s[pl++];
			}else if(s1.compareTo(s2) < 0) {
				string[p++] = s[ql++];
			}
		}
		while(pl <= pr) {
			string[p++] = s[pl++];
		}
		while(ql <= qr) {
			string[p++] = s[ql++];
		}
		while(left <= right) {
			s[right--] = string[--p];
		}
	}
}
