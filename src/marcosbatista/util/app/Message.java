package marcosbatista.util.app;

public class Message implements BusinessObject {
	
	private StringBuilder value;
	
	public void append(String value) {
		if(this.value == null) this.value = new StringBuilder();
		this.value.append(value);
	}
	
	public String getValue() {
		return value.toString();
	}
	
	@Override
	public String getSimpleClassName() {
		return this.getClass().getSimpleName();
	}
	
}
