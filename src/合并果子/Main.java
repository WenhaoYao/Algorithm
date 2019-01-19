package 合并果子;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		int sum = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int kinds = Integer.valueOf(reader.readLine().trim());
		String[] fruits = reader.readLine().split(" ");
		int[] nums = new int[kinds];
		for(int i = 0; i < kinds; i++) {
			nums[i] = Integer.valueOf(fruits[i]);
		}
		int times = 1;
		while(times < kinds) {
			int pointer1 = 0;
			while(nums[pointer1] == 0) {
				pointer1++;
			}
			int pointer2 = pointer1 + 1;
			while(nums[pointer2] == 0) {
				pointer2++;
			}
			int min = nums[pointer1], secondMin = nums[pointer2];
			if(min > secondMin) {
				min = nums[pointer2];
				secondMin = nums[pointer1];
				int temp = pointer1;
				pointer1 = pointer2;
				pointer2 = temp;
			}
			for(int i = (pointer1 > pointer2)?pointer1 + 1:pointer2 + 1; i < nums.length; i++) {
				if(nums[i] != 0) {				
					if(nums[i] < min) {
						secondMin = min;
						min = nums[i];
						pointer2 = pointer1;
						pointer1 = i;
					} else if(nums[i] < secondMin) {
						secondMin = nums[i];
						pointer2 = i;
					}
				}
			}
			int temp = min + secondMin;
			times++;
			sum += temp;
			nums[pointer1] = temp;
			nums[pointer2] = 0;			
		}
		System.out.println(sum);
	}
}
