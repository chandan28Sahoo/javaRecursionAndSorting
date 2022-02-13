package recursion;

public class FibonacciSeriesnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans = fibb(4);
		System.out.println(ans);
	}

	public static int fibb(int n) {
		if(n < 2) {
			return n;
		}
		return fibb(n - 1) + fibb(n - 2);
	}
}
