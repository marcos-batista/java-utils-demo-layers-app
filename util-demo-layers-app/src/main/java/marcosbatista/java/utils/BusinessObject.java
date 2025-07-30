package marcosbatista.java.utils;

public interface BusinessObject {
	
	public default String getSimpleClassName() {
		return this.getClass().getSimpleName();
	}
	
}
