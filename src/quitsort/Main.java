package quitsort;

import java.util.Random;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int a = scanner.nextInt();
		int[] nums = new int[a];
		for(int i = 0; i < a; i ++) {
			nums[i] = random.nextInt(1000000000);
		}
		quicksort(nums, 0, nums.length - 1);
		for(int i = 0; i< a; i ++) {
			System.out.print(nums[i] + " ");
		}
	}
	
	static void quickSort(int[] nums,int i,int j){
		int begin = i, end = j;
		if(begin < end) {
			int x = nums[begin];
			while(begin < end) {
				while(nums[end] >= x && begin < end) {
					end --;
				}
				while(nums[begin] <= x && begin < end) {
					begin ++;
				}
				if(begin < end) {
					int temp = nums[begin];
					nums[begin] = nums[end];
					nums[end] = temp;
				}
			}
			nums[i] = nums[begin];
			nums[begin] = x;
			quickSort(nums, i, begin - 1);
			quickSort(nums, end + 1, j);
		}
	}
        
	static void quicksort(int[] nums,int i,int j) {
		int begin = i, end = j;
		if(begin < end) {
			int x = nums[begin];
			while(begin < end) {
				while(begin < end && nums[end] >= x) {
					end--;
				}
				if(begin < end) {
					nums[begin++] = nums[end];
				}
				while(begin < end && nums[begin] <= x) {
					begin++;
				}
				if(begin < end) {
					nums[end--] = nums[begin];
				}
			}
			nums[begin] = x;
			quicksort(nums, i, begin - 1);
			quicksort(nums, end + 1, j);
		}
	}
}
