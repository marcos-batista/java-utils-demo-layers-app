package marcosbatista.util.app;

public class Manager<BO extends BusinessObject> {
	
	public BO factoryBusinessObject() {
		Action<BO> action = new FactoryBusinessObject<BO>();
		BO bo = action.run();
		return bo;
	}
	
	public <MSG extends Message> MSG factoryMessage() {
		Action<MSG> action = new FactoryMessage<MSG>();
		MSG message = action.run();
		return message;
	}
	
}
