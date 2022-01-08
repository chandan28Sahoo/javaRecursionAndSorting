package recursion;

public class FactorialOfN {

	public static int factorial(int n) {
		if(n == 1 || n == 0) {
			return 1;
		}
		return n * factorial(n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialOfN ob = new FactorialOfN();
		int n = 5;
		int ans = ob.factorial(n);
		System.out.println(ans);
	}

}
