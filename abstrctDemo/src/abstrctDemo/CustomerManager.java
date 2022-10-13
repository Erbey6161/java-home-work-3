package abstrctDemo;

import java.sql.DatabaseMetaData;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}

}
