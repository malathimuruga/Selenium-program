package week1day2homeassighnment;

public class Palindrome {
	
	public static void main(String[] args) {
	
	int no=121;
	int temp= no;
	int rev=0;

		while(no!=0)
	{
			rev=rev*10;
			rev=rev+(no%10);
			no=no/10;
				
	}
		
		if(temp==rev) {
			
			System.out.println("The number is palindrom :" +temp);
			
		}
		else {
			
			System.out.println("The number is not palindrom :" +temp);
		}		
    
		
		}
}
