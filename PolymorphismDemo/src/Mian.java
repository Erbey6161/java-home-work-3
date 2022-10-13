
public class Mian {

	public static void main(String[] args) {
		
		/*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLoger(), new DatabaseLogger(), new ConsolLogger()};
		
		for(BaseLogger logger:loggers) {
			logger.Log("Log mesajı");
		}*/
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
