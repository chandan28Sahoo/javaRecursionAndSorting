package recursion;

public class Duplicates {

	public static boolean map[] = new boolean[26];
	public static void removeDuplicates(String str, int idx, String newString) {
		if(idx == str.length()) {
			System.out.println(newString);
			return;
		}
		char currentChar = str.charAt(idx);
		if(map[currentChar - 'a']) {
			removeDuplicates(str, idx+1, newString);
		}else {
			newString += currentChar;
			map[currentChar - 'a'] = true;
			removeDuplicates(str, idx+1, newString);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duplicates ob = new Duplicates();
		ob.removeDuplicates("abbaaccd", 0,"");
	}

}
