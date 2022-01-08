package recursion;

public class KeypadCombination {
	public static String keypad [] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printCombination(int idx, String str, String combination) {
		if(idx == str.length()) {
			System.out.println(combination);
			return;
		}
		char currChar = str.charAt(idx);
		String mapping =  keypad[currChar - '0'];
		
		for (int i = 0; i<= mapping.length() - 1; i++) {
			printCombination(idx+1, str, combination + mapping.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KeypadCombination ob = new KeypadCombination();
		ob.printCombination(0, "23", "");
	}

}
