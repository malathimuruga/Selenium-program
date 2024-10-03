package week3day1homeassighnment;

public class CheckBoxButton extends Button {

	public void  clickCheckButton()
	{
		System.out.println("Click Check button");
	}
	
	
	public static void main(String[] args) {
		
		CheckBoxButton obj2= new CheckBoxButton();
		
		obj2.clickCheckButton();
		obj2.submit();
		obj2.click();
		obj2.setText("");
	}
}
