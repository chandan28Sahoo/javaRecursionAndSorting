package recursion;

public class PrintXPowerN {

	public static int calPower(int x, int n) {
		if(n == 0) {
			return 1;
		}
		if(x == 0) {
			return 0;
		};
		int power =  x * calPower(x , n-1);
		return power;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintXPowerN ob = new PrintXPowerN();
		int x = 2;
		int n = 3;
		int ans = ob.calPower(x,n);
		System.out.println(ans); 
	}

}
