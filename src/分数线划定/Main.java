package 分数线划定;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("all")
	public static void main(String[] args) {
		int temp = 0, row = 0, column = 0, score = 0;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		Integer[][] arr = new Integer[101][10001];
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int count = (int) (m * 1.5);
		for(int i = 0; i < n; i ++) {
			int id = scanner.nextInt();
			score = scanner.nextInt();
			arr[score][id] = 1;
		}
//		System.out.println(count);
		for(int i = 100; i >= 0 ; i--) {
			for(int j = 0; j < 10000;j++) {
				if(arr[i][j] != null && temp < count) {
					temp++;
					score = i;
					map.put(j, i);
					row = j + 1;
					column = i;
				}
			}
		}
		while(row < 10001) {
			if(arr[column][row] != null) {
				temp ++;
				map.put(row, column);
			}
			row++;
		}
		System.out.println(score + " " + temp);
		Iterator entries = map.entrySet().iterator();
		 
		while (entries.hasNext()) {
		 
		    Map.Entry entry = (Map.Entry) entries.next();
		 
		    Integer key = (Integer)entry.getKey();
		 
		    Integer value = (Integer)entry.getValue();
		 
		    System.out.println(key + " " + value);
		 
		}
	}
}
