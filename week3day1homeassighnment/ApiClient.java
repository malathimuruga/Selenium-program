package week3day1homeassighnment;

public class ApiClient {
	
	
	public void SendRequest(String endpoint) {
		
	System.out.println("Enter the End Point");
		
	}
	
    public void SendRequest(String endpoint,String requestBody,Boolean requestStatus) {
		
	System.out.println("Enter the End Point-2" );
	System.out.println("Request Body-2");
	System.out.println("Status");
		
	}


	public static void main(String[] args) {
		
		ApiClient obj=new ApiClient();
		obj.SendRequest("5");
		obj.SendRequest(" 5 ", "request body", true);
				
			

	}

}
