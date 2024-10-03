package week3day2homeassighnment;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		char[] ch = test.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		for (int i = ch.length - 1; i >= 0; i--) {
            
            if (i % 2 != 0) {
                
                ch[i] = Character.toUpperCase(ch[i]);
            }
        }
		 System.out.println(new String(ch));

	}

}
