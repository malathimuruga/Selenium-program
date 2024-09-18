package week1day1homeassighnment;

public class FibonacciSeries {
	public static void main(String[] args) {
		
		int n= 8;
		int firstnum=0;
		int secondnum=1;
		int nextnum=0;
		
		for(int i=1 ; i<=n ; i++) {
			
			System.out.print(firstnum  + " ,");
			nextnum= firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextnum;			
		}
	}

}
