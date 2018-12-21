package mergsort;

class Player{
	int id;
	int startPoint;
	int strength;
	@Override
	public String toString() {
		return "Player [id=" + id + ", startPoint=" + startPoint + ", strength=" + strength + "]";
	}
	
}
public class Main {

	
	
	public static Player[] tempPlayers = new Player[9999];
	public static int[] tempArr = new int[99999];
	public static void main(String[] args) {
		Player[] players = new Player[10];
		for(int i = 0; i < 10;i++) {
			players[i] = new Player();
			players[i].id = 9-i;
			players[i].strength = 10;
		}
		MergeSort(players, 0, 9);
		for (Player player : players) {
			System.out.println(player.toString());;
		}
	}
	
	public static void MergeSort(Player[] players, int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		MergeSort(players, left, mid);
		MergeSort(players, mid + 1, right);
		Merge(players, left, mid, right);
	}
	
	public static void Merge(Player[] players, int left, int mid, int right) {
		int p = 0;
		int pl = left, pr = mid;
		int ql = mid + 1, qr = right;
		while(pl <= pr && ql <= qr) {
			if(players[pl].strength < players[ql].strength) {
				tempPlayers[p++] = players[pl++];
			}else if(players[pl].strength == players[ql].strength && players[pl].id < players[ql].id) {
				tempPlayers[p++] = players[pl++];
			}else {
				tempPlayers[p++] = players[ql++];
			}
		}
		while(pl <= pr) {
			tempPlayers[p++] = players[pl++];
		}
		while(ql <= qr) {
			tempPlayers[p++] = players[ql++];
		}
		while(left <= right) {
			players[right--] = tempPlayers[--p];
		}
	}
	
	/**
	 * 
	 * @Title: MergeSort
	 * @Description: 整型数组的归并排序
	 * @param arr
	 * @param left
	 * @param right
	 * @return: void
	 */
	public static void MergeSort(int[] arr, int left, int right) {
		if(left >= right) {
			return;
		}
		int mid = (left + right) / 2;
		MergeSort(arr, left, mid);
		MergeSort(arr, mid + 1, right);
		Merge(arr, left, mid, right);
	}
	
	/**
	 * 
	 * @Title: Merge
	 * @Description: 整型数组的合并
	 * @param arr
	 * @param left
	 * @param mid
	 * @param right
	 * @return: void
	 */
	public static void Merge(int[] arr, int left, int mid, int right) {
		int p = 0;
		int pl = left, pr = mid;
		int ql = mid + 1, qr = right;
		
		while(pl <= pr || ql <= qr) {
			if(ql > qr || (pl <= pr && arr[pl] <= arr[ql])) {
				tempArr[p++] = arr[pl++];
			} else {
				tempArr[p++] = arr[ql++];
			}
		}
		while(left <= right) {
			arr[right--] = tempArr[--p];
		}
	}

}
