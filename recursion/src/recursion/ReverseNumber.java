package recursion;

public class ReverseNumber {

	public static void reverse(int num) {
		if(num == 0) {
			return ;
		}
		System.out.println(num);
		reverse(num - 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseNumber ob = new ReverseNumber();
		int num = 5;
		ob.reverse(num);
		
		
	}

}
