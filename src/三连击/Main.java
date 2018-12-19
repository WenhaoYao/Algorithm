package 三连击;

import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		String a, b;
		for(int i = 123; i <= 329; i++) {
			if((i/10%10) != i%10 && (i/10%10) != i/100 && i%10 != i/100) {
				a = Integer.toString(i * 2);
				b = Integer.toString(i * 3);
				a = a + b + Integer.toString(i);
				HashSet<String> set = new HashSet<>();
				int j = 0;
				while(set.add(String.valueOf(a.charAt(j))) && !a.contains("0") && j != 8) {
					j++;
				}
				if(j >= 8) {
					System.out.println(i + " " + i*2 + " " + i*3);
				}
			}
		}
	}
}
