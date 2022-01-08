package recursion;

public class SortedArray {

	public static boolean isSorted(int arr[], int indx) {
		if(indx == arr.length -1 ) {
			return true;
		}
		if(arr[indx] < arr[indx+1]) {
			return isSorted(arr,indx+1);
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SortedArray ob = new SortedArray();
		int arr[] = {1,2,3,4,5};
		int indx = 0;
		boolean ar =  ob.isSorted(arr,indx);
		System.out.println(ar);
	}

}
