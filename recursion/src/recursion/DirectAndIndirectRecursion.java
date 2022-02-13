package recursion;

public class DirectAndIndirectRecursion {
	public static int n = 1;
	public static void Odd() {
		if(n <= 10) {
			System.out.println(n+1);
			n++;
			Even();
		}
	}
	public static void Even() {
		if(n <= 10) {
			System.out.println(n-1);
			n++;
			Odd();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Odd();
	}

}
