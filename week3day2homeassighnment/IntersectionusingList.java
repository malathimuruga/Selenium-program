package week3day2homeassighnment;

public class IntersectionusingList {

	public static void main(String[] args) {
		
		int A[]= {3, 2, 11, 4, 6, 7};
		int B[]= {1, 2, 8, 4, 9, 7};
		
		System.out.println("Common elements in both arrays are:");

        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A [i]== B[j]) {
                    System.out.println(A[i]);
                }
            }
        }
			
	}

}
