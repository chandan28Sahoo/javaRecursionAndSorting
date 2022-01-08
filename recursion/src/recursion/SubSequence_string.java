package recursion;

import java.util.HashSet;

public class SubSequence_string {

	public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
		if(idx == str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
		}
		char currChar = str.charAt(idx);
		//to be 
		subsequences(str, idx+1, newString + currChar, set);
		// not to be
		subsequences(str, idx+1, newString,set);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubSequence_string ob = new SubSequence_string();
		HashSet<String> set = new  HashSet<>();
		ob.subsequences("aaa", 0, "",set);
	}

}
