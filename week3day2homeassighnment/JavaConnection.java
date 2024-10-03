package week3day2homeassighnment;

public class JavaConnection extends MySqlConnection {
	
	public void connect() {
		
		System.out.println("The connect the database");
	}
		
		public void disconnect() {
			System.out.println(" The disconnect the database");
		}
		
		public void executeUpdate() {
			System.out.println(" The executeupdate the database");
			
		}

		public void executeQuery() {
			System.out.println(" The execute Query the database");
		}
	public static void main(String[] args) {
		
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();
		
		

	}

}
