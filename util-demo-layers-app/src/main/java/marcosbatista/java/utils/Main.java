package marcosbatista.java.utils;

public class Main {
	
	public static void main(String[] args) {
		Controller controller = new Controller();
		Message message = controller.factoryMessage();
		System.out.println(message.getSimpleClassName());
		System.out.println(message.getValue());
	}
	
}
