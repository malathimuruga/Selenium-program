package week1day1homeassighnment;

public class Library {
	
	public String Addbook (String bookTitle) {
		System.out.println("Book added successfully.");
		return bookTitle;
		}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully.");
	}	
	
  public static void main(String[] args) {
	  
	  Library Object= new Library();
	  Object. Addbook("bookTitle");
	  Object.issueBook();
	  
		}

}
