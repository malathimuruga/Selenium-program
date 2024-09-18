package week1day2homeassighnment;

import java.util.Arrays;

public class FindMissingElement {
	
	
	public static void main(String[] args) {
			
		int arr[]= {1,4,3,2,8,6,7};
  
		int n = arr.length + 1;
		
		int sum= (n* (n+1))/2 ;
			
		for (int i=0; i < arr.length ; i++)
		{
		sum = sum - arr[i];
		}
		
		System.out.println(" The missing element is :" + sum);
		
		
		}
}
