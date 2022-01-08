package recursion;

public class SumOfN_naturalNumber {

	public static void sumOfN_Number(int i ,int n, int sum) {
		
		if(i == n) {
			sum += i;
			System.out.println(sum);
			return ;
		}else {
			sum += i;
		}
		
		sumOfN_Number(i+1, n, sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOfN_naturalNumber ob = new SumOfN_naturalNumber();
		int num = 10;
		ob.sumOfN_Number(1,num,0);
	}
}
