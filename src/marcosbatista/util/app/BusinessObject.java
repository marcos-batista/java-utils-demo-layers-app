package marcosbatista.util.app;

public interface BusinessObject {
	
	public default String getSimpleClassName() {
		return this.getClass().getSimpleName();
	}
	
}
