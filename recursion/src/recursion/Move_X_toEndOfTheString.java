package recursion;

public class Move_X_toEndOfTheString {
	public static void xString(String str, int idx,int count, String NewString) {
		if(idx == str.length()) {
			for (int i=0; i<count; i++) {
				NewString+="x";
			}
			System.out.println(NewString);
			return;
		}if(str.charAt(idx) == 'x') {
			count ++;
			xString(str,idx+1,count,NewString);
		}
		else {
			NewString+=str.charAt(idx);
			xString(str,idx+1,count,NewString);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Move_X_toEndOfTheString ob = new Move_X_toEndOfTheString();
		ob.xString("axbcxxdjxx",0,0,""); 
	}

}
