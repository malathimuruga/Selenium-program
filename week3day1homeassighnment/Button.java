package week3day1homeassighnment;

public class Button extends WebElement {
	
	public void submit()
	{
		System.out.println("submit the button");
	}

public static void main(String[] args) {
	
	Button obj= new Button ();

	obj.submit();
	obj.click();
	obj.setText("");
	
	
	
	
}
}
