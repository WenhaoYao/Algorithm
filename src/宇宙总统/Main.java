package 宇宙总统;

import java.util.Scanner;

public class Main {

	
	@SuppressWarnings("all")
	public static void main(String[] args) {
		int i = 0, person = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		String[] arr = new String[num];
		for(i = 0; i < num; i ++) {
			arr[i] = scanner.next();			
		}
		i = 0;
		while(i < num) {
			if(arr[i].length() > arr[person].length() || arr[i].length() == arr[person].length() && arr[i].compareTo(arr[person]) > 0) {
				person = i;
			}
			i++;
		}
		System.out.println(person + 1);
		System.out.println(arr[person]);
	}

}
