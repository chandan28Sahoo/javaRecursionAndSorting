package binarySearch;

public class FindElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		int target = 5;
		int ans = searchElement(arr,0, arr.length - 1 , target);
		System.out.println(ans);
	}
	
	public static int searchElement(int [] arr ,int s, int e, int target) {
		if(s>e) {
			return -1;
		}
		int mid = (s+e) / 2;
		if(arr[mid] == target) {
			return arr[mid];
		}
		if(target < arr[mid]) {
			return searchElement(arr,s, mid - 1 , target);
		}
		return searchElement(arr,mid+1, e , target);
	}

}
