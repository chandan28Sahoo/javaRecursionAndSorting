package recursion;

public class Print1TON {

	public static void assending(int num) {
		if(num == 6) {
			return ;
		}
		System.out.println(num);
		assending(num + 1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Print1TON ob = new Print1TON();
		int num = 1;
		ob.assending(num);
		
		
	}

}
