package marcosbatista.util.app;

public interface Action<BO extends BusinessObject> {
	
	public BO run();
	
}
