package demo1;

public class HappyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HappyNum n = new HappyNum();
		System.out.println(n.isHappy(4));
	}
	
	boolean isHappy(int num) {
		num = function(num);
		while(num != 1) {
			num = function(num);
			if(num == 4) {
				return false;
			}
		}
		
		return true;
	}

	int function(int num) {
		if (num >= 10) {
			int temp = num % 10;
			num = num / 10;
			return temp * temp + function(num);
		}
		return num * num;
		
	}
}
