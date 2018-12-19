package 明明的随机数;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Set<Object> set = new HashSet<Object>();
		for(int i = 0; i < num; i ++) {
			set.add(scanner.nextInt());
		}
		Object[] o = set.toArray();
		int nums[] = new int[o.length];
		for(int i = 0; i < o.length; i++) {
			nums[i] = (int) o[i];
		}
		quicksort(nums, 0, nums.length - 1);
		System.out.println(nums.length);
		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

	static void quicksort(int[] nums,int i,int j) {
		int begin = i, end = j;
		int x = nums[begin];
		if(begin < end) {
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
