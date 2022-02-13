package binarySearch;

public class FindSmallestCharTotarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'c','f','j'};
		char target = 'g';
		char ans = cillingOfCharElement(arr,0, arr.length - 1 , target);
		System.out.println(ans);
	}
	
	public static char cillingOfCharElement(char[] arr ,int s, int e, char target) {
//		if(s == arr.length) {
//			return arr[0];
//		}
		if(s>e) {
			return arr[s % arr.length];
		}
		int mid = (s+e) / 2;
		
		if(target < arr[mid]) {
			return cillingOfCharElement(arr,s, mid - 1 , target);
		}
		return cillingOfCharElement(arr,mid+1, e , target);
	}
}
