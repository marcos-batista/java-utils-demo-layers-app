package marcosbatista.util.app;

public class FactoryBusinessObject<BO extends BusinessObject> implements Action<BO> {

	@Override
	public BO run() {
		Service service = new Service();
		BO bo = service.factoryBusinessObject();
		return bo;
	}
	
}
