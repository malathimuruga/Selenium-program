package week3day2homeassighnment;

import java.lang.reflect.Array;

public class Anagram {

	public static void main(String[] args) {
		
		 String  text1 = "stops"; 
		 String  text2 = "potss";
		 
		 int charCount = text1.length();
			
			System.out.println("Number of chars :"+charCount);
			
			
			if(text1.equals(text2)) {
				System.out.println("its equals() ");
			}else {
				System.out.println("not equals()");
			}

			char[] ch = text1.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch[i]);
			}
			
			System.out.println();
		
			char[] ch1 = text2.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				System.out.print(ch1[i]);
			}
			
	char [] ch.Sort();
	char[] ch1.sort();
	
	
			
			
		

	}

}
