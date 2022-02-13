package binarySearch;

public class GraterCharToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr = {'c','f','j'};
		char target = 'i';
		char ans = floorOfCharElement(arr,0, arr.length - 1 , target);
		System.out.println(ans);
	}
	
	public static char floorOfCharElement(char[] arr ,int s, int e, char target) {
		if(e<s) {
			return arr[e];
		}
		int mid = (s+e) / 2;

		if(target < arr[mid]) {
			return floorOfCharElement(arr,s, mid - 1 , target);
		}
		return floorOfCharElement(arr,mid+1, e , target);
	}

}
