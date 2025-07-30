package marcosbatista.util.app;

public class Service {
	
	@SuppressWarnings("unchecked")
	public <BO extends BusinessObject> BO factoryBusinessObject() {
		return (BO) new BusinessObject() {};
	}
	
	@SuppressWarnings("unchecked")
	public <MSG extends Message> MSG factoryMessage() {
		return (MSG) new Message();
	}
	
}
