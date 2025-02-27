package CollegeClass;

public class RotationAraay_One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length-1;
		for(int i=0; i<n; i++) {
			if(i != n) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
		}
		
		for(int i=0 ; i<=n ;i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
