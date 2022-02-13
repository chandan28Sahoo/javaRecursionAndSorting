package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseStringLCProblem {
	
	public static void revString(int index1, int index, char[] inputString, char[] temp) {

		if(index < 0) {
			System.out.println(Arrays.toString(temp));
			return;
		}
		
		char charIndex = inputString[index];
		temp[index1] = charIndex;
		revString(index1 + 1,index - 1, inputString, temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = "helloworld";
		char [] charArr = new char[inputString.toCharArray().length];
		revString(0,inputString.toCharArray().length - 1,inputString.toCharArray(),charArr);
	}
}
