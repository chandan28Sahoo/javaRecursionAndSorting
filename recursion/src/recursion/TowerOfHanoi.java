package recursion;

public class TowerOfHanoi {

	public static void towerOf_hanoi(int n, String source, String helper, String destination) {
		if(n == 1) {
			System.out.println("Transfer disk "+ n +" from "+ source +" to "+ destination);
			return;
		}
		towerOf_hanoi(n-1, source, destination, helper);
		System.out.println("Transfer disk "+ n +" from "+ source +" to "+ destination);
		towerOf_hanoi(n-1, helper, source, destination);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHanoi ob = new TowerOfHanoi();
		int n = 3;
		ob.towerOf_hanoi(n, "S", "H", "D");
	}

}
