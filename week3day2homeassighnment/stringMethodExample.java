package week3day2homeassighnment;

public class stringMethodExample {

	private static String replaceAll;

	public static void main(String[] args) {
		
		String value ="Selenium Java";
		
		 String replace = value.replace('e','E');
		 
		 System.out.println(" The replace value is " +replace);
		  		 
		 String replaceAll = value.replaceAll("[a-z]","0");
		 
		 System.out.println(" The replaceall value is " +replaceAll);
		 
		 String amt="5645";
		 
		 int parseint= Integer.parseInt(amt);
		 
		 System.out.println("The amount is " +parseint); 
		 

	}

}
