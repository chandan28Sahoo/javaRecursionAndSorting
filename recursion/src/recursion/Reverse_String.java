package recursion;

public class Reverse_String {
	String y;
	public static void reverse(int index, String name) {
		if(index == 0) {
			System.out.print(name.charAt(index));
			return;
		}
		 System.out.print(name.charAt(index));
		 reverse(index-1,name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse_String ob = new Reverse_String();
		String name = "chandan";
		
		int index = name.length() - 1;
		ob.reverse(index,name);
		
	}

}
