package recursion;

public class PracticeRecusion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		message(1);
	}
	public static void message(int n) {
		if(n == 5) {
			System.out.println("hello world" + n);
			return;
		}
		System.out.println("hello world" + n);
		message(n + 1);
		System.out.println("message");
	}

}
