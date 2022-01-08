package sortings;

public class Selection_sort {

	public static void printArray(int arr[]) {
		for (int i = 0; i<= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 5, 1, 8 , 2 ,3 };
		for(int i = 0; i<arr.length -1; i++) {
			int smallest = i;
			for(int j = i+1; j<arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		printArray(arr);
	}

}
