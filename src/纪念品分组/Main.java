package 纪念品分组;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int limit = Integer.valueOf(reader.readLine().trim());
		int number = Integer.valueOf(reader.readLine().trim());
		int[] nums = new int[number];
		for(int i = 0; i < number; i++) {
			nums[i] = Integer.valueOf(reader.readLine().trim());
		}
		int begin = 0, end = number - 1;
		int[] bowl = new int[201];
		for (int i : nums) {
			bowl[i]++;
		}
		int j = 0;
		for(int i = 0;i < 201; i++) {
			while(bowl[i] >= 1) {
				nums[j]=i;
				bowl[i]--;
				j++;
			}
		}
//		quicksort(nums, begin, end);
		int group = 0;
		while(begin <= end) {
			if(begin == end) {
				group++;
				break;
			}
			if(nums[begin] + nums[end] > limit) {
				end--;
				group++;
			}else {
				begin++;
				end--;
				group++;
			}
		}
		System.out.println(group);
	}
	
	static void quicksort(int[] nums, int i, int j) {
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
