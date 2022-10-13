package abstrctDemo;

public class Main {
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.databaseManager = new MySqlDataManager();
		customerManager.getCustomers();
		
	}

}
