package marcosbatista.util.app;

public class FactoryMessage<MSG extends Message> implements Action<MSG> {

	@Override
	public MSG run() {
		Service service = new Service();
		MSG message = service.factoryMessage();
		return message;
	}
	
}
