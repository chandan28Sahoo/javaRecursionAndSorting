package sortings;

public class Bubble_Sort {

	public static void printArray(int arr[]) {
		for (int i = 0; i<= arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 5, 1, 8 , 2 ,3 };
		for (int i = 0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		printArray(arr);
	}

}
