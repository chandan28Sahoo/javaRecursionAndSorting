package binarySearch;

import java.util.Arrays;

public class FindFirstAndLastElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,7,7,7,8,8,8,10};
		int ans[] = {-1, -1};
		int target = 7;
		int start = search(arr,-1,0, arr.length - 1 , target, true);
		int end = search(arr,-1,0, arr.length - 1 , target, false);
		ans[0] = start;
		ans[1] = end;
		System.out.println(Arrays.toString(ans));
	}
	
	public static int search(int [] arr , int ans,int s, int e, int target, Boolean firstIndex) {
		if(s>e) {
			return ans;
		}
		int mid = (s+e) / 2;
		if(target == arr[mid]) {
			ans = mid;
			if(firstIndex) {
				return search(arr,ans,s, mid - 1 , target, firstIndex);
			}else {
				return search(arr,ans,mid+1, e , target, firstIndex);
			}
		}
		if(target < arr[mid]) {
			return search(arr,ans,s, mid - 1 , target, firstIndex);
		}
		return search(arr,ans,mid+1, e , target, firstIndex);
		
	}
}
