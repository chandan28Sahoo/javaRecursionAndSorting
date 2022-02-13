package binarySearch;

//smallest number of array that is >= target number
public class CelingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,5,6,14,17};
		int target = 18;
		int ans = celingOfAnumber(arr,0, arr.length - 1 , target);
		System.out.println(ans);
	}
	
	public static int celingOfAnumber(int [] arr ,int s, int e, int target) {
		if(target > arr[arr.length -1]) {
			return -1;
		}
		if(s>e) {
			return arr[s];
		}
		int mid = (s+e) / 2;
		if(arr[mid] == target) {
			return arr[mid];
		}
		if(target < arr[mid]) {
			return celingOfAnumber(arr,s, mid - 1 , target);
		}
		return celingOfAnumber(arr,mid+1, e , target);
	}

}
