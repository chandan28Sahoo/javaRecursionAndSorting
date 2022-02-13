package recursion;

import java.util.Arrays;
import java.util.Iterator;

public class SumTriangleFromArray {

	public static void sumTriangle(int [] arr) {
		if(arr.length < 1) {
			return;
		}
		
		int[] temp = new int[arr.length -1];
		for (int i = 0; i < arr.length -1; i++) {
			temp[i] = arr[i] + arr[i+1];
		}
		sumTriangle(temp);
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		sumTriangle(arr);
	}

}
