package marcosbatista.util.app;

public class Controller {
	
	public <MESSAGE extends Message> MESSAGE factoryMessage() {
		Manager<MESSAGE> manager = new Manager<MESSAGE>();
		MESSAGE message = manager.factoryMessage();
		message.append("Hello World!");
		return message;
	}
	
}
