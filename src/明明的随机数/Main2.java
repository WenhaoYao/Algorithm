package 明明的随机数;

import java.util.Scanner;

public class Main2 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] nums = new int[1001];
		for(int i = 0; i < num; i ++) {
			int temp = scanner.nextInt();
			if(nums[temp] == 0) {
				nums[temp] = temp;
				count++;
			}
		}
		System.out.println(count);
		for(int i = 0; i < nums.length; i ++) {
			if(nums[i] != 0) {
				System.out.print(nums[i] + " ");
			}
		}
	}

}
