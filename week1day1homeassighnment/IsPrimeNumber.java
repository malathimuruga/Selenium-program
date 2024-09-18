package week1day1homeassighnment;

import java.util.Iterator;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=13;
		int count=0;
	
		for(int i=2;i<=n;i++)
		{
				
			if(n%i==0) {
				count++;
	
			}
		}
				
				if(count>1) {
					System.out.println("The given number is not a prime number :" + n);
				}
				else {
					System.err.println("The given number is prime number :" +n);
				}
				
	}
}
 

		



			

		

	


