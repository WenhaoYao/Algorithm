package mixing_Milk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static class Farmer {
		int price;
		int numbers;
	}

	static Farmer[] tempFarmers = new Farmer[5001];

	public static void main(String[] args) throws Exception {
		int feed = 0;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] total = reader.readLine().split(" ");
		if(Integer.valueOf(total[1]) != 0) {
			Farmer[] farmers = new Farmer[Integer.valueOf(total[1])];
			for (int i = 0; i < Integer.valueOf(total[1]); i++) {
				String[] farms = reader.readLine().split(" ");
				farmers[i] = new Farmer();
				farmers[i].price = Integer.valueOf(farms[0]);
				farmers[i].numbers = Integer.valueOf(farms[1]);
			}
			mergeSort(farmers, 0, farmers.length - 1);
			int need = Integer.valueOf(total[0]);
			int i = 0;
			while (need >= farmers[i].numbers) {
				need -= farmers[i].numbers;
				feed += farmers[i].numbers * farmers[i++].price;
				if(i >= Integer.valueOf(total[1])) {
					break;
				}
			}
			if (need > 0) {
				feed += need * farmers[i].price;
			}
		}
		System.out.println(feed);
	}

	static void mergeSort(Farmer[] farmers, int left, int right) {
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		mergeSort(farmers, left, mid);
		mergeSort(farmers, mid + 1, right);
		merge(farmers, left, mid, right);
	}

	static void merge(Farmer[] farmers, int left, int mid, int right) {
		int p = 0;
		int pl = left, pr = mid;
		int ql = mid + 1, qr = right;
		while (pl <= pr && ql <= qr) {
			if (farmers[pl].price < farmers[ql].price) {
				tempFarmers[p++] = farmers[pl++];
			} else if (farmers[pl].price == farmers[ql].price && farmers[pl].numbers < farmers[ql].numbers) {
				tempFarmers[p++] = farmers[pl++];
			} else {
				tempFarmers[p++] = farmers[ql++];
			}
		}
		while (pl <= pr) {
			tempFarmers[p++] = farmers[pl++];
		}
		while (ql <= qr) {
			tempFarmers[p++] = farmers[ql++];
		}
		while (left <= right) {
			farmers[right--] = tempFarmers[--p];
		}
	}

}
