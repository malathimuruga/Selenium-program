package week3day2homeassighnment;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		
    String test = "I am a software tester";
        
        String[] words = test.split(" ");
        
        for (int i = 0; i < words.length; i++) {
            
            if (i % 2 == 1) {
              
                char[] charArray = words[i].toCharArray();
                
               
                for (int j = 0, k = charArray.length - 1; j < k; j++, k--) {
                    char temp = charArray[j];
                    charArray[j] = charArray[k];
                    charArray[k] = temp;
                }
                
                words[i] = new String(charArray);
            }
        }
        
        for (String word : words) {
            System.out.print(word + " ");
        }

	}

}
