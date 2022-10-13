package coreLogging;

public class MailLogger implements Logger{

	public MailLogger() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void log(String data) {
		// TODO Auto-generated method stub
		System.out.println("Mail ile loglandý: "+data);
		
	}

}
