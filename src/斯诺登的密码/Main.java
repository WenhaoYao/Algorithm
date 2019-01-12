package 斯诺登的密码;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static String[] numbers1 = "one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty".split(" ");
	public static String[] numbers2 = "a both another first second third".split(" ");
	public static int[] num2 = {1, 2, 1, 1, 2, 3};
	public static Map<String, Integer> map = new HashMap<>();
	static {
		for(int i = 0; i < numbers1.length; i++) {
			map.put(numbers1[i], i + 1);
		}
		for(int i = 0; i < numbers2.length; i++) {
			map.put(numbers2[i], num2[i]);
		}
	}
	public static void main(String[] args) throws Exception {
		String s = "0";
		int times = 0;
		int[] password = new int[400];
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] words = reader.readLine().replace(".", "").split(" ");
		for(String word : words) {
			if(map.containsKey(word.toLowerCase())) {
				int temp = (int)Math.pow(map.get(word.toLowerCase()), 2) % 100;
				password[temp] += 1;
				times++;
			}
		}
		for(int i = 0; i < 400; i++) {
			if(password[i] >= 1) {
				for(int j = 1; j <= password[i];j++) {
					if(i < 10) {
						s += "0" + String.valueOf(i);
					} else {
						s += String.valueOf(i);
					}
				}				
			}
		}
		while(s.startsWith("0") && times != 0) {
			s = s.replaceFirst("0", "");
		}
		System.out.println(s);
	}

}
