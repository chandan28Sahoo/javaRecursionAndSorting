package recursion;

/*
 A recusive function is said to be non-tail recursive if the recursive call is not the last thing done by the function.
 after returning back there is some somthing left to evaluate.
 * */
public class NON_Tail_recursion {

	public static void print1ToN(int n) {
		if(n == 0) {
			return ;
		}
		print1ToN(n - 1);
		System.out.println(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print1ToN(5);
	}

}
