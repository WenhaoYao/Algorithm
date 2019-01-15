package 潜伏者;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static String error = "Failed";
	static Character[] words = new Character[26];
	static Character[] map = new Character[26];
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int nums = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String encryptCode = reader.readLine();
		String decryptCode = reader.readLine();
		String encrytedCode = reader.readLine();
		char[] encryptChars = encryptCode.trim().toCharArray();
		char[] decryptChars = decryptCode.trim().toCharArray();
		for(int i = 0; i < encryptChars.length; i++) {
			int index = encryptChars[i] - 'A';
			if(map[index] == null) {
				map[index] = decryptChars[i];
				nums++;
			}else if(map[index] != null && map[index] != decryptChars[i]) {
				System.out.println(error);
				return;
			}
		}
		if(nums != 26 || isDiffrent(map)) {
			System.out.println(error);
			return;
		}
		for(char c : encrytedCode.trim().toCharArray()) {
			System.out.print(map[c - 'A']);
		}
	}

	static boolean isDiffrent(Character[] chars) {
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if (words[c - 'A'] != null) {
				return true;
			} else {
				words[c - 'A'] = c;
			}
		}
		return false;
	}
}
