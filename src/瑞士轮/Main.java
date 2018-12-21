package 瑞士轮;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Player{
	int id;
	int point;
	int strength;
	@Override
	public String toString() {
		return "Player [id=" + id + ", point=" + point + ", strength=" + strength + "]";
	}
	
}

public class Main {
	
	private static Player[] tempPlayers = new Player[200000];
	private static Player[] players = new Player[200000];

	@SuppressWarnings({ })
	public static void main(String[] args) throws Exception {
		BufferedReader buffer=new BufferedReader(new InputStreamReader(System.in));
//		Scanner scanner = new Scanner(System.in);
		String[] params_1 = buffer.readLine().split(" ");
		int playerNums = Integer.parseInt(params_1[0])*2;
		int match = Integer.parseInt(params_1[1]);
		int rank = Integer.parseInt(params_1[2]);
		
		String[] params_2 = buffer.readLine().split(" ");
		String[] params_3 = buffer.readLine().split(" ");
		for(int i = 0; i < playerNums;i++) {
			players[i] = new Player();
			players[i].id = i + 1;
			players[i].point = Integer.parseInt(params_2[i]);
			players[i].strength = Integer.parseInt(params_3[i]);
		}
//		比赛前的初始分数排序
		MergeSort(players, 0, playerNums - 1);
		for(int j = 0; j < match; j++) {
//			开始比赛
			for(int i = 0; i <= playerNums - 2; i = i + 2) {
				if(players[i].strength > players[i + 1].strength) {
					players[i].point += 1;
				}else if(players[i].strength < players[i + 1].strength) {
					players[i+1].point += 1;
				}
			}
			MergeSort(players, 0, playerNums - 1);
		}
		System.out.println(players[rank-1].id);

	}
	
	/**
	 * 
	 * @Title: MergeSort
	 * @Description: 按照总分从高到低对选手进行一次排名。总分相同的，约定编号较小的选手排名靠前。
	 * @param players
	 * @param left
	 * @param right
	 * @return: void
	 */
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
			if(players[pl].point > players[ql].point) {
				tempPlayers[p++] = players[pl++];
			}else if(players[pl].point == players[ql].point && players[pl].id < players[ql].id) {
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

}
