package CollegeClass;

import java.util.Arrays;

public class Rotation_K_time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		int k = 3;
		rotate(arr,k);
		System.out.print(Arrays.toString(arr));
	}
	public static void rotate(int[] arr, int k) {
		if(arr.length>=2 && k<arr.length ) {
			reverseArray(arr,0,arr.length-1);
			reverseArray(arr,0,k-1);
			reverseArray(arr,k,arr.length-1);
			
		}
	}
	public static void reverseArray(int[] arr, int start, int end) {
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
