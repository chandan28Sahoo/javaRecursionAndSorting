package binarySearch;
//grater smaller number <= targer number
public class FloorOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,5,6,14,17};
		int target = 10;
		int ans = floorOfNumber(arr,0, arr.length - 1 , target);
		System.out.println(ans);
	}
	
	public static int floorOfNumber(int [] arr ,int s, int e, int target) {
		if(target < arr[0]) {
			return -1;
		}
		if(e<s) {
			return arr[e];
		}
		int mid = (s+e) / 2;
		if(arr[mid] == target) {
			return arr[mid];
		}
		if(target < arr[mid]) {
			return floorOfNumber(arr,s, mid - 1 , target);
		}
		return floorOfNumber(arr,mid+1, e , target);
	}

}
