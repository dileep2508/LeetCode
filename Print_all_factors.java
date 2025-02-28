package CollegeClass;

public class Print_all_factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,3,2};
		long fact = 1;
		for(int num : arr) {
			fact = fact*num;
		}
		System.out.println("Factors is : "+fact);
		System.out.println("Factor are : " );
		
		for(long i=1; i<fact; i++) {
			if(fact%i==0) {
				System.out.print(i+" ");
			}
		}

	}

}
