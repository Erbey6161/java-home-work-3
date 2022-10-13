package coreLogging;

public class DatabaseLogger implements Logger{

	public DatabaseLogger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Database ile loglandý: "+data);
		
	}

}