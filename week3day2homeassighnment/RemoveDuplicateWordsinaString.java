package week3day2homeassighnment;

public class RemoveDuplicateWordsinaString {

	public static void main(String[] args) {
		
    String text = "We learn Java basics as part of java sessions in java week1";
        
        String lowerText = text.toLowerCase();
        
     
        String[] words = lowerText.split(" ");
        
        
        int count = 0;
        
       
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                
                if (words[i].equals(words[j]) && !words[i].equals("")) {
                    words[j] = "";  
                    count++;        
                }
            }
        }
        
       
        System.out.println("Modified array after removing duplicates:");
        for (String word : words) {
            if (!word.equals("")) {
                System.out.print(word + " ");
            }
        }
        
   
        System.out.println("Number of duplicates: " + count);
        
     
	}

}
