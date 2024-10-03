package week3day2homeassighnment;

public abstract class MySqlConnection implements DatabaseConnection {
	
public void connect() {
	
	System.out.println("The connect the database");
}
	
	public void disconnect() {
		System.out.println(" The disconnect the database");
	}
	
	public void executeUpdate() {
		System.out.println(" The executeupdate the database");
	}
	
	public abstract void executeQuery();
		
}
