package week3day1homeassighnment;

public class LoginTestData extends TestData {
	
	public void enterUsername() {
		System.out.println(" Enter the User Nmae");
	}
	
	public void enterPassword(){
		System.out.println(" Enter the Passward");
	}


	public static void main(String[] args) {
		
		LoginTestData obj=new LoginTestData();
		
		obj.enterCredentials();
		obj.navigateToHomePage();
		obj.enterUsername();
		obj.enterPassword();

	}

}
