package marcosbatista.java.utils;

public interface Action<BO extends BusinessObject> {
	
	public BO run();
	
}
