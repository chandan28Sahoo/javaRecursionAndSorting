package recursion;

public class FibonacciSeries {

	public static void fibonacci(int a,int b, int n ) {
		if(n == 0) {
			return;
		}
		int c = a + b;
		System.out.println(c);
		fibonacci(b,c,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciSeries ob = new FibonacciSeries();
		int n = 5;
		int a = 0; int b = 1;
		System.out.println(a);
		System.out.println(b);
		ob.fibonacci(a,b,n);
	}

}
