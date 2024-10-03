package week3day1homeassighnment;

public class TextField extends WebElement{
	
public void getText()
		{
		
		System.out.println(" Get Text ");
	}

public static void main(String[] args) {
	
	TextField obj1= new TextField();
	
	obj1.getText();
   obj1.click();
   obj1.setText("");

}
}